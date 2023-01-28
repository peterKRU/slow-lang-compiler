package compiler;

import java.io.IOException;

import bytecode_generator.BytecodeExporter;

public class Runner {

	public static void main(String[] args) {


		String fileName = "test_source.txt";
		Compiler compiler = new Compiler();

		int[] bytecode = compiler.compile(fileName);

		try {
			BytecodeExporter.export(bytecode, "test_compiled.txt");
		} catch (IOException e) {
			e.printStackTrace();
		}		
		
	}

}
