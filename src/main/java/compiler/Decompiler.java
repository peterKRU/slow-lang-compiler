package compiler;

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
}
