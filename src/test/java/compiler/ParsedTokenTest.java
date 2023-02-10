package compiler;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class ParsedTokenTest {

	@Test
	@DisplayName("Test ParsedToken constructor: should return true")
	final void parsedTokenConstructorTest() {
		
		ParsedToken testToken = new ParsedToken("INT", "15");
 		
 		assertTrue(testToken.getType() == "INT" && testToken.getValue() == "15");
	}
	
	@Test
	@DisplayName("Compare two equal tokens: should be equal")
	final void testCompareTwoEqualTokens() {
		
		ParsedToken testTokenOne = new ParsedToken("INT", "15");
		ParsedToken testTokenTwo = new ParsedToken("INT", "15");
		
 		assertEquals(testTokenOne, testTokenTwo);
	}
	
	@Test
	@DisplayName("Compare two different parsed tokens: should not be equal")
	final void testCompareTwoDifferenTokens() {
		
		ParsedToken testTokenOne = new ParsedToken("INT", "15");
		ParsedToken testTokenTwo = new ParsedToken("STRING", "test");
		
 		assertFalse(testTokenOne.equals(testTokenTwo));
	}	

}
