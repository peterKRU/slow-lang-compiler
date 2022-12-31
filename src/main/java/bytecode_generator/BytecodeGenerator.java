package bytecode_generator;

import java.util.List;

import org.antlr.v4.runtime.tree.ParseTree;

public class BytecodeGenerator {

	public static int[] generateBytecode(ParseTree parseTree) {
		
		List<String> tokensList = ParseTreeWalker.convertToList(parseTree);
		List<Integer> bytecodesList = ExpressionTranslator.translateExpressions(tokensList);

		bytecodesList.add(Bytecodes.HALT);
		int[] bytecodesArray = bytecodesList.stream().mapToInt(i -> i).toArray();		
		
		return bytecodesArray;
	}	
	
}
