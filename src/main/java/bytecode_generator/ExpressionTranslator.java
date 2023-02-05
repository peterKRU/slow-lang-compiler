package bytecode_generator;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import compiler.ParsedToken;

public class ExpressionTranslator implements TokenTranslator {

	public List<Integer> translateExpressions(List<ParsedToken> parsedTokens) {

		List<Integer> translatedTokens = new ArrayList<Integer>();
		
		for (ParsedToken token : parsedTokens) {

			String tokenType = token.getType();
			String tokenValue = token.getValue();
			
			if (tokenType == "INT") {

				Integer integerValue = convertToInteger(tokenValue);
				translatedTokens.add(Bytecodes.ICONST);
				translatedTokens.add(integerValue);

			} else if (tokenType == "ID") {
				
				if(tokenValue.charAt(0) == '*') {
					
					Integer hashValue = getHashValue(tokenValue.substring(1));
					translatedTokens.add(Bytecodes.CALL);
					translatedTokens.add(hashValue);
				
				} else if (tokenValue.charAt(0) == '$') {

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

			} else if (tokenType == "MINUS") {

				translatedTokens.add(Bytecodes.ISUB);
				
			} else if (tokenType == "MUL") {

				translatedTokens.add(Bytecodes.IMUL);
				
			} else if (tokenType == "DIV") {

				translatedTokens.add(Bytecodes.IDIV);
			
			} else if (tokenType == "MAIN") {

				translatedTokens.add(Bytecodes.MAIN);
			
			} else if (tokenType == "CLASS") {

				translatedTokens.add(Bytecodes.CDECL);
				
			} else if (tokenType == "RETURN") {

				translatedTokens.add(Bytecodes.RET);
				
			} else if (tokenType == "INT_TYPE") {

				translatedTokens.add(Bytecodes.GSTORE);
				
			}
			
			else {
				
				System.out.println("ExpressionTranslator: unknown token type");
			}
		}

		translatedTokens.add(Bytecodes.HALT);
		
		//System.out.println(translatedTokens);
		
		return translatedTokens;
	}

	private Integer getHashValue(String tokenValue) {

		return Objects.hashCode(tokenValue);
	}

	private Integer convertToInteger(String tokenValue) {

		Integer integerValue = null;

		try {
			integerValue = Integer.parseInt(tokenValue);
		} catch (NumberFormatException e) {
			System.out.println("ExpressionTranslator: input string is not a valid integer");
		}

		return integerValue;
	}

	@Override
	public List<Integer> translateTokens(List<ParsedToken> parsedTokens) {
		
		return translateExpressions(parsedTokens);
	}

}
