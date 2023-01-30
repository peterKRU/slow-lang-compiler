package compiler;

import java.util.ArrayList;
import java.util.List;

import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.Parser;
import org.antlr.v4.runtime.tree.ParseTree;

import bytecode_generator.BytecodeCompiler;
import bytecode_generator.BytecodeGenerator;

@SuppressWarnings("deprecation")
public class Compiler implements FileImporter, BytecodeCompiler {

	private Lexer lexer;
	private Parser parser;
	private FileImporter fileImporter;
	private ParseTreeWalker parseTreeWalker;
	private ShuntingYard shuntingYard;
	private BytecodeGenerator bytecodeGenerator;

	public Compiler() {

		this.bytecodeGenerator = new BytecodeGenerator();
	}

	public int[] compile(String fileName) {

		String rawTokens = importFile(fileName);

		lexer = new SlowLangV1Lexer(new ANTLRInputStream(rawTokens));
		parser = new SlowLangV1Parser(new CommonTokenStream(lexer));
		ParseTree parseTree = ((SlowLangV1Parser) parser).program();

		List<ParsedToken> parsedTokens = generalizeParseTree(parseTree);
		List<ParsedToken> convertedExpressions = convertTokensList(parsedTokens);

		int[] bytecode = compileBytecode(convertedExpressions);
		exportBytecode(bytecode, fileName);

		return bytecode;
	}

	public ParseTree parse(String rawTokens) {

		lexer = new SlowLangV1Lexer(new ANTLRInputStream(rawTokens));
		parser = new SlowLangV1Parser(new CommonTokenStream(lexer));
		ParseTree parseTree = ((SlowLangV1Parser) parser).program();

		return parseTree;
	}

	@Override
	public String importFile(String fileName) {

		fileImporter = new FileReader();

		return fileImporter.importFile(fileName);
	}

	private List<ParsedToken> generalizeParseTree(ParseTree parseTree) {

		parseTreeWalker = new ParseTreeWalker();

		List<ParsedToken> parsedTokensList = new ArrayList<ParsedToken>();
		parseTreeWalker.walkTree(parseTree, parsedTokensList);

		return parsedTokensList;
	}

	private List<ParsedToken> convertTokensList(List<ParsedToken> parsedTokens) {

		shuntingYard = new ShuntingYard();

		return shuntingYard.convertToPostfix(parsedTokens);
	}

	@Override
	public int[] compileBytecode(List<ParsedToken> parsedTokens) {

		return bytecodeGenerator.compileBytecode(parsedTokens);
	}

	public void exportBytecode(int[] bytecode, String filePath) {

		bytecodeGenerator.export(bytecode, filePath);
	}
}
