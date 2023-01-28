package compiler;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.antlr.v4.runtime.tree.ParseTree;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class ParseTreeWalkerTest {
	
	public static String[] expectedOutput = {"[MAIN : main]", "[LBRACE : {]", "[ID : x]", "[ASSIGN : =]", "[INT : 2]", "[MINUS : -]", "[INT : 1]", "[SEMI : ;]", "[PRINT : print]", "[LPAREN : (]", "[ID : x]", "[RPAREN : )]", "[SEMI : ;]", "[RBRACE : }]"};
	
	@Test
	@DisplayName("Test ParseTreeWalker with default input: method output should match exptectedOutput array")
	final void testParseTreeWalker() {
		
		FileImporter fileReader = new FileReader();
		String testSourceCode = fileReader.importFile("unit_test_source.txt");
		Compiler slowLangCompiler = new Compiler();
 		ParseTree parseTree = (ParseTree) slowLangCompiler.parse(testSourceCode);
		ParseTreeWalker slowLangTreeWalker = new ParseTreeWalker();
		
 		List<ParsedToken> parsedTokens = new ArrayList<ParsedToken>();
 		slowLangTreeWalker.walkTree(parseTree, parsedTokens);
 		
 		for(int i = 0; i < expectedOutput.length; i++) {
 			
 			String expectedToken = expectedOutput[i];
 			String actualToken = parsedTokens.get(i).toString();
 			
 			assertEquals(expectedToken, actualToken);
 		}
	}

}
