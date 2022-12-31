package bytecode_generator;

import java.util.ArrayList;
import java.util.List;

public class ExpressionTranslator {

	public static List<Integer> translateExpressions(List<String> parseTreeList) {

		List<Integer> bytecodeList = new ArrayList<Integer>();

		for (String token : parseTreeList) {

			if (Vocabulary.isOperator(token)) {

				switch (token) {

				case "=" -> {
					bytecodeList.add(Bytecodes.ASS);
				}
				case "+" -> {
					bytecodeList.add(Bytecodes.IADD);
				}
				case "-" -> {
					bytecodeList.add(Bytecodes.ISUB);
				}
				case "*" -> {
					bytecodeList.add(Bytecodes.IMUL);
				}
				case "/" -> {
					bytecodeList.add(Bytecodes.IDIV);
				}
				case "||" -> {
					bytecodeList.add(Bytecodes.OR);
				}
				case "&&" -> {
					bytecodeList.add(Bytecodes.AND);
				}
				case "==" -> {
					bytecodeList.add(Bytecodes.IEQ);
				}
				case "!=" -> {
					bytecodeList.add(Bytecodes.IEQ);
					bytecodeList.add(Bytecodes.NOT);
				}
				case ">" -> {
					bytecodeList.add(Bytecodes.IGT);
				}
				case "<" -> {
					bytecodeList.add(Bytecodes.ILT);
				}
				default -> {
					bytecodeList.add(777777);
				}

				}
			}

			else if (isIntegerType(token)) {

				bytecodeList.add(Bytecodes.LSTORE);
				bytecodeList.add(Integer.valueOf(token.substring(1)));
			}

			else if (isIdentifierType(token)) {

				bytecodeList.add(Bytecodes.LREF);
				bytecodeList.add(token.substring(1).hashCode());
			}

			else if (isEndOfFile(token)) {

				bytecodeList.add(Bytecodes.HALT);
			}

		}

		return bytecodeList;
	}

	public static boolean isIntegerType(String token) {

		return token.charAt(0) == '$';
	}

	public static boolean isIdentifierType(String token) {

		return token.charAt(0) == '#';
	}

	public static boolean isEndOfFile(String token) {

		return token == "EOF";
	}

}
