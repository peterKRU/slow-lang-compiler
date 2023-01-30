package compiler;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;

import org.antlr.v4.runtime.tree.ParseTree;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class ShuntingYardTest {

	String[] expectedOutput = { "[ID : $x]", "[INT : 2]", "[INT : 1]", "[MINUS : -]", "[ASSIGN : =]", "[ID : x]",
			"[PRINT : print]" };

	@Test
	@DisplayName("Test convertToPostfix method with default input: method output should match exptectedOutput array")
	final void testConvertToPostfixMethod() {

		FileImporter fileReader = new FileReader();
		String testSourceCode = fileReader.importFile("unit_test_source.txt");
		Compiler slowLangCompiler = new Compiler();
		ParseTree parseTree = (ParseTree) slowLangCompiler.parse(testSourceCode);
		ParseTreeWalker slowLangTreeWalker = new ParseTreeWalker();

		List<ParsedToken> parsedTokens = new ArrayList<ParsedToken>();
		slowLangTreeWalker.walkTree(parseTree, parsedTokens);

		ShuntingYard shunitingYard = new ShuntingYard();
		List<ParsedToken> convertedTokens = shunitingYard.convertToPostfix(parsedTokens);

		for (int i = 0; i < expectedOutput.length; i++) {

			String generatedToken = convertedTokens.get(i).toString();
			String expectedToken = expectedOutput[i];

			assertEquals(generatedToken, expectedToken);
		}

	}

}
