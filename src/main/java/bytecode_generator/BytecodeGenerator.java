package bytecode_generator;

import java.util.List;

import org.antlr.v4.runtime.tree.ParseTree;

public class BytecodeGenerator {

	public static int[] generateBytecode(ParseTree parseTree) {

		List<Integer> translatedExpressions = ExpressionTranslator.translateExpressions(parseTree);
		int[] bytecodesArray = translatedExpressions.stream().mapToInt(i -> i).toArray();

		return bytecodesArray;
	}

}
