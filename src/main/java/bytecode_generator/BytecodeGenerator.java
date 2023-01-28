package bytecode_generator;

import java.util.List;

import org.antlr.v4.runtime.tree.ParseTree;

import compiler.ParsedToken;

public class BytecodeGenerator implements BytecodeCompiler {

	public static int[] generateBytecode(ParseTree parseTree) {

		List<Integer> translatedExpressions = ExpressionTranslator.translateExpressions(parseTree);
		int[] bytecodesArray = translatedExpressions.stream().mapToInt(i -> i).toArray();

		return bytecodesArray;
	}

	@Override
	public int[] compileBytecode(List<ParsedToken> parsedTokens) {
		
		return null;
	}

}
