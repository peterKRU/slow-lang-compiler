package compiler;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ParseTreeNormalizer {

	public static List<ParsedToken> normalize(List<ParsedToken> parsedTokens) {

		List<List<ParsedToken>> blocks = splitBlocks(parsedTokens);
		List<List<ParsedToken>> normalizedBlocks = new ArrayList<List<ParsedToken>>();

		for (List<ParsedToken> block : blocks) {

			ParsedToken identifierToken = block.get(0);

			if (isMainBlock(identifierToken)) {

				List<ParsedToken> normalizedMainExecutionBlock = normalizeMainExecutionBlock(block);
				normalizedBlocks.add(normalizedMainExecutionBlock);

			} else if (isClass(identifierToken)) {

				List<ParsedToken> normalizedClass = normalizeClass(block);
				normalizedBlocks.add(normalizedClass);
			}
		}

		List<ParsedToken> flatOutput = flatten(normalizedBlocks);

		return flatOutput;
	}

	private static List<List<ParsedToken>> splitBlocks(List<ParsedToken> parsedTokens) {

		List<List<ParsedToken>> blocks = new ArrayList<List<ParsedToken>>();
		List<ParsedToken> currentBlock = new ArrayList<ParsedToken>();

		for (int i = 0; i < parsedTokens.size(); i++) {

			ParsedToken token = parsedTokens.get(i);

			if (token.getType() == "CLASS") {

				blocks.add(currentBlock);
				currentBlock = new ArrayList<ParsedToken>();
			}

			currentBlock.add(token);
		}

		blocks.add(currentBlock);

		return blocks;
	}

	private static List<ParsedToken> normalizeMainExecutionBlock(List<ParsedToken> mainExecutionBlockTokens) {

		List<ParsedToken> normalizeDMainExecutionBlock = ShuntingYard.convertToPostfix(mainExecutionBlockTokens);

		return normalizeDMainExecutionBlock;
	}

	private static List<ParsedToken> normalizeClass(List<ParsedToken> classTokens) {

		ParsedToken classId = classTokens.get(1);
		List<List<ParsedToken>> methods = new ArrayList<List<ParsedToken>>();
		List<ParsedToken> currentMethod = new ArrayList<ParsedToken>();

		for (int i = 2; i < classTokens.size(); i++) {

			ParsedToken currentToken = classTokens.get(i);

			if (isTypeDeclaration(currentToken)) {

				ParsedToken nextToken = classTokens.get(i + 2);

				if (isMethodDeclaration(nextToken)) {

					List<ParsedToken> methodParameters = new ArrayList<ParsedToken>();
					ParsedToken methodId = classTokens.get(i + 1);

					currentMethod.add(methodId);

					for (int parametersBlockStart = i + 3; parametersBlockStart < classTokens
							.size(); parametersBlockStart++) {

						ParsedToken parameterToken = classTokens.get(parametersBlockStart);

						if (parameterToken.getType() == "RPAREN") {

							i = parametersBlockStart + 2;
							break;
						}

						if (parameterToken.getType() == "ID") {

							methodParameters.add(parameterToken);
						}
					}

					List<ParsedToken> methodBody = new ArrayList<ParsedToken>();

					for (int methodBodyStart = i; methodBodyStart < classTokens.size(); methodBodyStart++) {

						ParsedToken methodBodyToken = classTokens.get(methodBodyStart);

						if (methodBodyToken.getType() == "RBRACE") {

							i = methodBodyStart;
							break;
						}

						methodBody.add(methodBodyToken);
					}

					Integer parametersCount = methodParameters.size();
					ParsedToken parametersCountToken = new ParsedToken("INT", parametersCount.toString());
					currentMethod.add(parametersCountToken);
					currentMethod.addAll(methodParameters);

					List<ParsedToken> normalizedMethodBody = ShuntingYard.convertToPostfix(methodBody);

					currentMethod.addAll(normalizedMethodBody);

					methods.add(currentMethod);
					currentMethod = new ArrayList<ParsedToken>();
				}
			}

		}

		List<ParsedToken> flatOutput = new ArrayList<ParsedToken>();
		flatOutput.add(classId);

		for (List<ParsedToken> method : methods) {

			flatOutput.addAll(method);
		}

		return flatOutput;
	}

	private static List<ParsedToken> flatten(List<List<ParsedToken>> lists) {

		return lists.stream().flatMap(List::stream).collect(Collectors.toList());
	}

	private static boolean isTypeDeclaration(ParsedToken token) {

		return token.getType() == "INT_TYPE";
	}

	private static boolean isMethodDeclaration(ParsedToken nextToken) {

		return nextToken.getType() == "LPAREN";
	}

	private static boolean isMainBlock(ParsedToken identifierToken) {

		return identifierToken.getType() == "MAIN";
	}

	private static boolean isClass(ParsedToken identifierToken) {

		return identifierToken.getType() == "CLASS";
	}
}
