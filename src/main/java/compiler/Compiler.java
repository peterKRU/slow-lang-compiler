package compiler;

import java.util.ArrayList;
import java.util.List;

import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.Parser;
import org.antlr.v4.runtime.tree.ParseTree;

@SuppressWarnings("deprecation")
public class Compiler implements FileImporter{

	private Lexer lexer;
	private Parser parser;
	private FileImporter fileImporter;
	private ParseTreeWalker parseTreeWalker;
	private ShuntingYard shuntingYard;
	
	public ParseTree compile(String fileName) {
		
		String rawTokens = importFile(fileName);
		lexer = new SlowLangV1Lexer(new ANTLRInputStream(rawTokens));
		parser = new SlowLangV1Parser(new CommonTokenStream(lexer));
		ParseTree parseTree = ((SlowLangV1Parser) parser).program();
		List<ParsedToken> parsedTokens = generalizeParseTree(parseTree);
		List<ParsedToken> convertedExpressions = convertTokensList(parsedTokens);
		
		return parseTree;
	}

	@Override
	public String importFile(String fileName) {
		
		fileImporter = new FileReader();
		
		return fileImporter.importFile(fileName);
	}
	
	private List<ParsedToken> generalizeParseTree(ParseTree parseTree){
		
		parseTreeWalker = new ParseTreeWalker();
		
		List<ParsedToken> parsedTokensList = new ArrayList<ParsedToken>();
		parseTreeWalker.walkTree(parseTree, parsedTokensList);
		
		return parsedTokensList;
	}
	
	private List<ParsedToken> convertTokensList(List<ParsedToken> parsedTokens){
		
		shuntingYard = new ShuntingYard();
		
		return shuntingYard.convertToPostfix(parsedTokens);
	}
}
