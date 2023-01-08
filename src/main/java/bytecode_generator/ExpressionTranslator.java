package bytecode_generator;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import org.antlr.v4.runtime.tree.ParseTree;

import compiler.ParseTreeWalker;
import compiler.ParsedToken;
import compiler.ShuntingYard;

public class ExpressionTranslator {

	public static List<Integer> translateExpressions(ParseTree parseTree) {

		List<ParsedToken> parsedTokens = new ArrayList<ParsedToken>();
		ParseTreeWalker.walkTree(parseTree, parsedTokens);
		List<ParsedToken> processedTokens = ShuntingYard.convertToPostfix(parsedTokens);
		List<Integer> translatedTokens = new ArrayList<Integer>();

		for (ParsedToken token : processedTokens) {

			String tokenType = token.getType();
			String tokenValue = token.getValue();

			if (tokenType == "INT") {

				Integer integerValue = convertToInteger(tokenValue);
				translatedTokens.add(Bytecodes.ICONST);
				translatedTokens.add(integerValue);

			} else if (tokenType == "ID") {

				if (tokenValue.charAt(0) == '$') {

					Integer hashValue = getHashValue(tokenValue.substring(1));
					translatedTokens.add(Bytecodes.VSTORE);
					translatedTokens.add(hashValue);
				} else {

					Integer hashValue = getHashValue(tokenValue);
					translatedTokens.add(Bytecodes.VLOAD);
					translatedTokens.add(hashValue);
				}

			} else if (tokenType == "ASSIGN") {

				translatedTokens.add(Bytecodes.ASS);

			} else if(tokenType == "PRINT") {
				
				translatedTokens.add(Bytecodes.PRINT);
				
			} else if (tokenType == "PLUS") {

				translatedTokens.add(Bytecodes.IADD);

			} 
			else if (tokenType == "MINUS") {

				translatedTokens.add(Bytecodes.ISUB);

			}			
			else {

				throw new RuntimeException("ExpressionTranslator: unknown token type");
			}
		}

		translatedTokens.add(Bytecodes.HALT);

		return translatedTokens;
	}

	private static Integer getHashValue(String tokenValue) {

		return Objects.hashCode(tokenValue);
	}

	private static Integer convertToInteger(String tokenValue) {

		Integer integerValue = null;

		try {
			integerValue = Integer.parseInt(tokenValue);
		} catch (NumberFormatException e) {
			System.out.println("ExpressionTranslator: input string is not a valid integer");
		}

		return integerValue;
	}
}
