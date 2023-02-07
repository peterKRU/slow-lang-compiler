package bytecode_generator;

import java.nio.ByteBuffer;
import java.util.List;

import compiler.ParsedToken;

public class BytecodeGenerator implements BytecodeCompiler, BytecodeFormatter {

	private TokenTranslator tokenTranslator;

	public BytecodeGenerator() {

		this.tokenTranslator = new ExpressionTranslator();
	}

	public byte[] generateBytecode(List<ParsedToken> parsedTokens) {

		List<Integer> translatedTokens = tokenTranslator.translateTokens(parsedTokens);
		int[] instructionsArray = translatedTokens.stream().mapToInt(i -> i).toArray();
		
		return convertToBytes(instructionsArray);
	}

	private static byte[] convertToBytes(int[] intArray) {

		ByteBuffer byteBuffer = ByteBuffer.allocate(intArray.length * 4);

		for (int i : intArray) {

			byteBuffer.putInt(i);
		}

		return byteBuffer.array();
	}

	private static String convertBytesToHex(byte[] bytes) {

		StringBuilder builder = new StringBuilder();
		int i = 0;

		for (byte b : bytes) {

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
	public byte[] compileBytecode(List<ParsedToken> parsedTokens) {

		return generateBytecode(parsedTokens);
	}

	@Override
	public String convertToHex(byte[] bytes) {

		return convertBytesToHex(bytes);
	}

}
