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
	@DisplayName("Test ParsedToken comparison method: should return true")
	final void parsedTokenComparisonTest() {
		
		ParsedToken testTokenOne = new ParsedToken("INT", "15");
		ParsedToken testTokenTwo = new ParsedToken("INT", "15");
		
 		assertEquals(testTokenOne, testTokenTwo);
	}
	
	@Test
	@DisplayName("Test ParsedToken comparison method 2: should return false")
	final void parsedTokenComparisonTest2() {
		
		ParsedToken testTokenOne = new ParsedToken("INT", "15");
		ParsedToken testTokenTwo = new ParsedToken("STRING", "test");
		
 		assertFalse(testTokenOne.equals(testTokenTwo));
	}	

}
