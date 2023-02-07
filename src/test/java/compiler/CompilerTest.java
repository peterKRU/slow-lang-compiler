package compiler;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class CompilerTest {

	public static int[] expectedOutput = { 88, 120, 80, 2, 80, 1, 21, 85, 89, 120, 100, 101 };

	@Test
	@DisplayName("Test compile method with default input: method output should match exptectedOutput array")
	final void testCompileMethod() {

		Compiler compiler = new Compiler();
		byte[] compiledCode = compiler.compile("unit_test_source.txt");

		for (int i = 0; i < compiledCode.length; i++) {

			int generatedItem = compiledCode[i];
			int exprectedItem = expectedOutput[i];
			
			assertEquals(generatedItem, exprectedItem);
		}
	}

}
