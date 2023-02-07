package compiler;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class ShuntingYard {

	private static final Map<String, Integer> precedenceMap = new HashMap<>();

	static {
		precedenceMap.put("ASSIGN", 0);
		precedenceMap.put("PRINT", 0);
		precedenceMap.put("PLUS", 1);
		precedenceMap.put("MINUS", 1);
		precedenceMap.put("MULT", 2);
		precedenceMap.put("DIV", 2);
	}

	public static List<ParsedToken> convertToPostfix(List<ParsedToken> parsedTokens) {

		List<ParsedToken> cleanExpressions = stripBrackets(parsedTokens);
		List<List<ParsedToken>> splitExpressions = splitExpressions(cleanExpressions);
		List<List<ParsedToken>> convertedExpressions = convertAll(splitExpressions);
		List<ParsedToken> flattenedExpressions = flatten(convertedExpressions);
		List<ParsedToken> fixedFunctionCalls = normalizeFunctionCalls(flattenedExpressions);

		return fixedFunctionCalls;
	}

	private static List<ParsedToken> flatten(List<List<ParsedToken>> expressions) {

		return expressions.stream().flatMap(List::stream).collect(Collectors.toList());
	}

	private static List<List<ParsedToken>> convertAll(List<List<ParsedToken>> expressions) {

		List<List<ParsedToken>> output = new ArrayList<List<ParsedToken>>();

		for (List<ParsedToken> expression : expressions) {

			List<ParsedToken> converted = applyShuntingYard(expression);
			output.add(converted);
		}

		return output;
	}

	private static List<ParsedToken> applyShuntingYard(List<ParsedToken> expression) {

		Deque<ParsedToken> stack = new ArrayDeque<ParsedToken>();
		List<ParsedToken> output = new ArrayList<ParsedToken>();

		for (ParsedToken parsedToken : expression) {

			if (isOperator(parsedToken)) {

				while (!stack.isEmpty() && isOperator(stack.peek())
						&& precedenceMap.get(parsedToken.getType()) <= precedenceMap.get(stack.peek().getType())) {
					output.add(stack.pop());
				}

				stack.push(parsedToken);

			} else if (isLeftParen(parsedToken)) {

				stack.push(parsedToken);

			} else if (isRightParen(parsedToken)) {

				while (!isLeftParen(stack.peek())) {

					output.add(stack.pop());
				}

				stack.pop();

			} else if (isVariable(parsedToken)) {

				output.add(parsedToken);

			} else {

				output.add(parsedToken);
			}
		}

		while (!stack.isEmpty()) {

			output.add(stack.pop());
		}

		return output;

	}

	public static List<ParsedToken> normalizeFunctionCalls(List<ParsedToken> parsedTokens) {

		List<ParsedToken> processedTokens = new ArrayList<ParsedToken>();

		for (int i = 0; i < parsedTokens.size(); i++) {

			ParsedToken currentToken = parsedTokens.get(i);

			if (isFunctionCall(currentToken)) {

				for (int functionParametersIndex = i + 1; functionParametersIndex < parsedTokens
						.size(); functionParametersIndex++) {

					ParsedToken parameterToken = parsedTokens.get(functionParametersIndex);

					if (parameterToken.getType() != "ID") {

						i = functionParametersIndex - 1;
						break;
					}

					processedTokens.add(parameterToken);
				}
			}

			if (currentToken.getType() == "RETURN") {

				processedTokens.add(parsedTokens.get(i + 1));
				processedTokens.add(currentToken);
				i = i + 2;

				continue;
			}

			processedTokens.add(currentToken);
		}

		return processedTokens;
	}

	private static List<List<ParsedToken>> splitExpressions(List<ParsedToken> parsedTokens) {

		List<List<ParsedToken>> expressions = new ArrayList<List<ParsedToken>>();
		List<ParsedToken> currentExpression = new ArrayList<ParsedToken>();

		for (int i = 0; i < parsedTokens.size(); i++) {

			ParsedToken token = parsedTokens.get(i);
			String tokenType = token.getType();

			if (tokenType == "COMMA") {

				continue;
			}

			if (tokenType == "ID") {

				ParsedToken nextToken = parsedTokens.get(i + 1);

				if (nextToken.getType() == "LPAREN") {

					token.addModifier("*");
				}
			}

			if (tokenType == "ASSIGN") {

				ParsedToken previousToken = parsedTokens.get(i - 1);
				previousToken.addModifier("$");
			}

			if (token.getType() != "SEMI") {

				currentExpression.add(token);

			} else {
				expressions.add(currentExpression);
				currentExpression = new ArrayList<ParsedToken>();
			}
		}

		return expressions;
	}

	private static List<ParsedToken> stripBrackets(List<ParsedToken> parsedTokens) {

		List<ParsedToken> output = new ArrayList<ParsedToken>();

		for (ParsedToken parsedToken : parsedTokens) {

			if (!isBracket(parsedToken)) {
				output.add(parsedToken);
			}
		}

		return output;

	}

	private static boolean isFunctionCall(ParsedToken token) {

		String tokenType = token.getType();

		return tokenType == "ID" && token.getValue().charAt(0) == '*';
	}

	private static boolean isBracket(ParsedToken token) {

		String tokenType = token.getType();

		return tokenType == "LBRACE" || tokenType == "RBRACE";
	}

	private static boolean isOperator(ParsedToken token) {

		return precedenceMap.containsKey(token.getType());
	}

	private static boolean isLeftParen(ParsedToken token) {

		return token.getType() == "LPAREN";
	}

	private static boolean isRightParen(ParsedToken token) {

		return token.getType() == "RPAREN";
	}

	private static boolean isVariable(ParsedToken token) {

		return token.getType() == "ID";
	}

}
