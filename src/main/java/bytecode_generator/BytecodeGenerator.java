package bytecode_generator;

import java.io.IOException;
import java.util.List;

import compiler.ParsedToken;

public class BytecodeGenerator implements BytecodeCompiler, Exporter {

	private TokenTranslator tokenTranslator;
	private Exporter exporter;

	public BytecodeGenerator() {

		this.tokenTranslator = new ExpressionTranslator();
		this.exporter = new BytecodeExporter();
	}

	public int[] generateBytecode(List<ParsedToken> parsedTokens) {

		List<Integer> translatedExpressions = tokenTranslator.translateTokens(parsedTokens);
		int[] bytecodesArray = translatedExpressions.stream().mapToInt(i -> i).toArray();

		return bytecodesArray;
	}

	@Override
	public int[] compileBytecode(List<ParsedToken> parsedTokens) {

		return generateBytecode(parsedTokens);
	}

	@Override
	public void export(int[] bytecode, String filePath) {

		try {
			exporter.export(bytecode, filePath);
		} catch (IOException e) {

			e.printStackTrace();
		}
	}

}
