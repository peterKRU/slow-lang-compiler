package compiler;

import java.util.List;

import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.TerminalNode;
import bytecode_generator.Vocabulary;

public class ParseTreeWalker {

	public void walkTree(ParseTree parseTree, List<ParsedToken> outputTokens) {

		if (parseTree instanceof TerminalNode) {

			String nodeValue = parseTree.getText();
			int nodeType = ((TerminalNode) parseTree).getSymbol().getType();

			if (!isEndOfFile(nodeType)) {

				String typeName = Vocabulary.TOKEN_NAMES[nodeType];
				outputTokens.add(new ParsedToken(typeName, nodeValue));
			}

		} else {

			for (int i = 0; i < parseTree.getChildCount(); i++) {
				walkTree(parseTree.getChild(i), outputTokens);
			}
		}

	}

	private static boolean isEndOfFile(int tokenTypeIndex) {

		return tokenTypeIndex == -1;
	}

}
