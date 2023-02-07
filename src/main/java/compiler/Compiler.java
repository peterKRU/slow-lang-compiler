package compiler;

import java.io.IOException;
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
public class Compiler implements FileImporter, FileExporter, BytecodeCompiler {

	private Lexer lexer;
	private Parser parser;
	private FileImporter fileImporter;
	private ParseTreeWalker parseTreeWalker;
	private BytecodeGenerator bytecodeGenerator;
	private FileExporter fileExporter;

	private static String programName;

	public Compiler() {

		bytecodeGenerator = new BytecodeGenerator();
		fileExporter = new BytecodeExporter();
	}

	public byte[] compile(String fileName) {

		String rawTokens = importFile(fileName);

		programName = fileName;

		lexer = new SlowLangV1Lexer(new ANTLRInputStream(rawTokens));
		parser = new SlowLangV1Parser(new CommonTokenStream(lexer));
		ParseTree parseTree = ((SlowLangV1Parser) parser).program();

		List<ParsedToken> parsedTokens = generalizeParseTree(parseTree);
		List<ParsedToken> convertedExpressions = convertTokensList(parsedTokens);

		byte[] bytecode = compileBytecode(convertedExpressions);

		String exportFileName = renameSourceToCompiled(fileName);
		String hexBytes = bytecodeGenerator.convertToHex(bytecode);

		try {
			export(hexBytes, exportFileName);
		} catch (IOException e) {

			e.printStackTrace();
		}

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

		List<ParsedToken> normalizedTokens = ParseTreeNormalizer.normalize(parsedTokens);

		return normalizedTokens;
	}

	@Override
	public byte[] compileBytecode(List<ParsedToken> parsedTokens) {

		return bytecodeGenerator.compileBytecode(parsedTokens);
	}

	private static String renameSourceToCompiled(String fileName) {

		int index = fileName.lastIndexOf("_source.txt");

		if (index == -1) {

			throw new IllegalArgumentException("Invalid file name format: " + fileName);
		}

		return fileName.substring(0, index) + "_compiled.txt";
	}

	@Override
	public void export(String content, String fileName) throws IOException {

		fileExporter.export(content, fileName);
	}

	public static String getProgramName() {

		return stripSource(programName);
	}

	private static String stripSource(String fileName) {

		if (fileName.endsWith("_source.txt")) {

			return fileName.substring(0, fileName.length() - "_source.txt".length());
		}
		
		return fileName;
	}
}
