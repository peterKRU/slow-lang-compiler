package compiler;

import java.nio.ByteBuffer;

import bytecode_generator.Bytecodes;

public class Decompiler {

	public static void decompile(int[] instructions) {
		
		int programId = instructions[0];
		System.out.println("PROG_ID " + programId);

		for (int i = 1; i < instructions.length; i++) {

			int instruction = instructions[i];

			if (instruction == Bytecodes.IADD) {

				System.out.println("IADD");

			} else if (instruction == Bytecodes.ISUB) {

				System.out.println("ISUB");

			} else if (instruction == Bytecodes.ICONST) {

				System.out.println("ICONST " + instructions[++i]);
				
			} else if (instruction == Bytecodes.VSTORE) {
				
				System.out.println("VSTORE " + instructions[++i]);
			
			} else if (instruction == Bytecodes.VLOAD) {
				
				System.out.println("VLOAD " + instructions[++i]);
			
			} else if (instruction == Bytecodes.ASS) {
				
				System.out.println("ASS");
				
			} else if (instruction == Bytecodes.CALL) {
				
				System.out.println("CALL " + instructions[++i]);
				
			} else if (instruction == Bytecodes.CDECL) {
				
				System.out.println("CDECL " + instructions[++i]);
			}
			
			else {

				System.out.println("UNKNOWN TOKEN");
			}

		}
	}
	
	public static int[] convertHexToInt(String hexString) {

		hexString = hexString.replace("\n", "").replace(" ", "");

		byte[] byteArray = new byte[hexString.length() / 2];

		for (int i = 0; i < byteArray.length; i++) {
			int index = i * 2;
			byteArray[i] = (byte) ((Character.digit(hexString.charAt(index), 16) << 4)
					+ Character.digit(hexString.charAt(index + 1), 16));
		}

		return convertByteToInt(byteArray);
	}

	public static int[] convertByteToInt(byte[] byteArray) {

		ByteBuffer byteBuffer = ByteBuffer.wrap(byteArray);

		int[] intArray = new int[byteArray.length / 4];

		for (int i = 0; i < intArray.length; i++) {

			intArray[i] = byteBuffer.getInt();
		}

		return intArray;
	}	
	
}
