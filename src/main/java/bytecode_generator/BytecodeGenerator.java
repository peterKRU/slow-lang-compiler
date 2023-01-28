package bytecode_generator;

import java.util.List;

import compiler.ParsedToken;

public class BytecodeGenerator implements BytecodeCompiler {
	
	private static ExpressionTranslator expressionTranslator;
	
	public static int[] generateBytecode(List<ParsedToken> parsedTokens) {
		
		expressionTranslator = new ExpressionTranslator();
		
		List<Integer> translatedExpressions = expressionTranslator.translateExpressions(parsedTokens);
		int[] bytecodesArray = translatedExpressions.stream().mapToInt(i -> i).toArray();

		return bytecodesArray;
	}

	@Override
	public int[] compileBytecode(List<ParsedToken> parsedTokens) {
		
		return generateBytecode(parsedTokens);
	}

}
