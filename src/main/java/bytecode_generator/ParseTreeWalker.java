package bytecode_generator;

import java.util.ArrayList;
import java.util.List;

import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.TerminalNode;

public class ParseTreeWalker {

	public static List<String> convertToList(ParseTree parseTree) {

		List<String> outputList = new ArrayList<String>();
		walkParseTreeInOrder(parseTree, outputList);
		List<String> tokensInPostfixNotation = InfixToPostfixConverter.convert(outputList);
		
		return tokensInPostfixNotation;
	}

	private static void walkParseTreeInOrder(ParseTree parseTree, List<String> outputList) {

		if (parseTree instanceof TerminalNode) {

			String nodeValue = parseTree.getText();
			int nodeTypeCode = ((TerminalNode) parseTree).getSymbol().getType();

			if (isIntegerLiteral(nodeTypeCode)) {
				outputList.add("$" + nodeValue);
			} else if (isIdentifier(nodeTypeCode)) {
				outputList.add("#" + nodeValue);
			} else if (Vocabulary.isOperator(nodeValue)) {
				outputList.add(nodeValue);
			}

		} else {

			for (int i = 0; i < parseTree.getChildCount(); i++) {
				walkParseTreeInOrder(parseTree.getChild(i), outputList);
			}
		}
	}

	private static boolean isIntegerLiteral(int tokenTypeCode) {
		
		if(tokenTypeCode < 0) {
			return false;
		}
		
		return Vocabulary.TOKEN_NAMES[tokenTypeCode] == "INT";
	}
	
	private static boolean isIdentifier(int tokenTypeCode) {

		if(tokenTypeCode < 0) {
			return false;
		}		
		
		return Vocabulary.TOKEN_NAMES[tokenTypeCode] == "ID";
	}	
	
}
