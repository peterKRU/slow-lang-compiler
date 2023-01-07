package compiler;

import java.io.IOException;

import org.antlr.v4.runtime.tree.ParseTree;

import bytecode_generator.BytecodeExporter;
import bytecode_generator.BytecodeGenerator;

public class Runner {

	public static void main(String[] args) {


		String fileName = "test_source.txt";
		Compiler compiler = new Compiler();
		ParseTree parseTree = compiler.compile(fileName);

		int[] bytecode = BytecodeGenerator.generateBytecode(parseTree);

		try {
			BytecodeExporter.export(bytecode, "test_compiled.txt");
		} catch (IOException e) {
			e.printStackTrace();
		}		
		
	}

}
