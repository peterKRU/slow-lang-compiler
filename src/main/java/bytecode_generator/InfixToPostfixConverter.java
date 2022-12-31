package bytecode_generator;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class InfixToPostfixConverter {

	public static List<String> convert(List<String> infixTokens) {
		
		List<String> postfixTokens = new ArrayList<>();
		Stack<String> operatorStack = new Stack<>();

		for (String token : infixTokens) {

			if (isOperand(token)) {
				postfixTokens.add(token);
			}

			else if (isOperator(token)) {

				if (token.equals("=")) {
					while (!operatorStack.isEmpty()) {
						postfixTokens.add(operatorStack.pop());
					}
				}
				
				else {
					while (!operatorStack.isEmpty() && getPrecedence(token) <= getPrecedence(operatorStack.peek())) {
						postfixTokens.add(operatorStack.pop());
					}
				}

				operatorStack.push(token);
			}

			else if (token.equals("(")) {
				operatorStack.push(token);
			}
			
			else if (token.equals(")")) {
				while (!operatorStack.peek().equals("(")) {
					postfixTokens.add(operatorStack.pop());
				}
				
				operatorStack.pop();
			}
		}

		while (!operatorStack.isEmpty()) {
			postfixTokens.add(operatorStack.pop());
		}

		return postfixTokens;
	}
	
	private static boolean isIntegerLiteral(String token) {
		
		return token.charAt(0) == '$';
	}	
	
	private static boolean isIdentifier(String token) {
		
		return token.charAt(0) == '#';
	}
	
	private static boolean isOperand(String token) {
		
		return isIntegerLiteral(token) || isIdentifier(token);
	}
	
	private static boolean isOperator(String token) {
		
		return Vocabulary.isOperator(token);
	}

	private static int getPrecedence(String operator) {

		if (operator.equals("="))
			return 1;
		if (operator.equals("+") || operator.equals("-"))
			return 2;
		if (operator.equals("*") || operator.equals("/"))
			return 3;

		else
			return 0;
	}	
	
}
