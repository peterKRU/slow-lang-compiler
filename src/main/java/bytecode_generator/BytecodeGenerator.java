package bytecode_generator;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.List;

import compiler.ParsedToken;

public class BytecodeGenerator implements BytecodeCompiler, Exporter {

	private TokenTranslator tokenTranslator;
	private Exporter exporter;

	public BytecodeGenerator() {

		this.tokenTranslator = new ExpressionTranslator();
		this.exporter = new BytecodeExporter();
	}

	public String generateBytecode(List<ParsedToken> parsedTokens) {

		List<Integer> translatedTokens = tokenTranslator.translateTokens(parsedTokens);
		int[] instructionsArray = translatedTokens.stream().mapToInt(i -> i).toArray();

		return convertToHex(instructionsArray);
	}

	private static byte[] convertToBytes(int[] intArray) {

		ByteBuffer byteBuffer = ByteBuffer.allocate(intArray.length * 4);

		for (int i : intArray) {

			byteBuffer.putInt(i);
		}

		return byteBuffer.array();
	}

	public static String convertToHex(int[] intArray) {

		byte[] byteArray = convertToBytes(intArray);
		StringBuilder builder = new StringBuilder();
		int i = 0;

		for (byte b : byteArray) {

			builder.append(String.format("%02x ", b & 0xff));
			i++;

			if (i % 16 == 0) {

				builder.append("\n");
			}
		}

		builder.append("\n");

		return builder.toString();
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
