package bytecode_generator;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;

import org.antlr.v4.runtime.tree.ParseTree;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import compiler.Compiler;
import compiler.FileImporter;
import compiler.FileReader;
import compiler.ParseTreeWalker;
import compiler.ParsedToken;
import compiler.ShuntingYard;

class BytecodeGeneratorTest {

	public static int[] expectedOutput = { 88, 120, 80, 2, 80, 1, 21, 85, 89, 120, 100, 101 };

	@Test
	@DisplayName("Test generateBytecode method with default input: method output should match exptectedOutput array")
	final void testGenerateBytecodeMethod() {

		FileImporter fileReader = new FileReader();
		String testSourceCode = fileReader.importFile("unit_test_source.txt");
		Compiler slowLangCompiler = new Compiler();
		ParseTree parseTree = (ParseTree) slowLangCompiler.parse(testSourceCode);
		ParseTreeWalker slowLangTreeWalker = new ParseTreeWalker();

		List<ParsedToken> parsedTokens = new ArrayList<ParsedToken>();
		slowLangTreeWalker.walkTree(parseTree, parsedTokens);

		ShuntingYard shunitingYard = new ShuntingYard();
		List<ParsedToken> convertedTokens = shunitingYard.convertToPostfix(parsedTokens);

		BytecodeGenerator bytecodeGenerator = new BytecodeGenerator();

		byte[] bytecode = bytecodeGenerator.generateBytecode(convertedTokens);

		for (int i = 0; i < expectedOutput.length; i++) {

			int generatedToken = bytecode[i];
			int expectedToken = expectedOutput[i];

			assertEquals(generatedToken, expectedToken);
		}

	}

}
