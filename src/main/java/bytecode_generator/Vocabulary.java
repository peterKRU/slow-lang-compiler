package bytecode_generator;

import java.util.Set;

public class Vocabulary {

	public static final String[] TOKEN_NAMES = {

			null, "CLASS", "MAIN", "IF", "ELSE", "WHILE", "RETURN", "NEW", "INT_TYPE", "FLOAT_TYPE", "STRING_TYPE", "PRINT",
			"INT", "FLOAT", "STRING", "ID", "WS", "ASSIGN", "OR", "AND", "EQ", "NE", "LT", "GT", "LE", "GE", "PLUS",
			"MINUS", "MULT", "DIV", "MOD", "NOT", "BIT_NOT", "INCR", "DECR", "LPAREN", "RPAREN", "LBRACE", "RBRACE",
			"LBRACK", "RBRACK", "SEMI", "COMMA", "DOT" };

	public static final Set<String> binaryOperators = Set.of("=", "||", "&&", "==", "!=", "<", ">", "<=", ">=", "+",
			"-", "*", "/");
	public static final Set<String> unaryOperators = Set.of("%", "!", "~", "++", "--");
	public static final Set<String> separators = Set.of("(", ")", "{", "}", "[", "]", ";", ",", ".");
	public static final Set<String> keywords = Set.of("class", "main", "if", "else", "while", "return", "new", "int",
			"float", "string");

	public static boolean isOperator(String token) {

		return isBinaryOperator(token) || isUnaryOperator(token);
	}

	public static boolean isBinaryOperator(String token) {

		return binaryOperators.contains(token);
	}

	public static boolean isUnaryOperator(String token) {

		return unaryOperators.contains(token);
	}

	public static boolean isSeparator(String token) {

		return separators.contains(token);
	}

	public static boolean isKeyword(String token) {

		return keywords.contains(token);
	}

}
