package compiler;

import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.Parser;
import org.antlr.v4.runtime.tree.ParseTree;

@SuppressWarnings("deprecation")
public class Compiler {

	private Lexer lexer;
	private Parser parser;

	public ParseTree compile(String fileName) {

		String rawTokens = FileReader.readFile(fileName);
		lexer = new SlowLangV1Lexer(new ANTLRInputStream(rawTokens));
		parser = new SlowLangV1Parser(new CommonTokenStream(lexer));
		ParseTree parseTree = ((SlowLangV1Parser) parser).program();
		
		return parseTree;
	}
	
}
