package compiler;

import java.io.IOException;

import org.antlr.v4.runtime.tree.ParseTree;

import bytecode_generator.BytecodeExporter;
import bytecode_generator.BytecodeGenerator;

public class Runner {

	public static void main(String[] args) {

		System.out.println("compiling...");

		String fileName = "testCode.txt";
		Compiler compiler = new Compiler();
		ParseTree parseTree = compiler.compile(fileName);

		int[] bytecode = BytecodeGenerator.generateBytecode(parseTree);

		try {
			BytecodeExporter.export(bytecode, "compiledTest");
		} catch (IOException e) {
			e.printStackTrace();
		}		
		
		System.out.println("compiled");
	}

}
