package compiler;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import bytecode_generator.BytecodeExporter;

public class ResourceCompiler {

	public static void compileResources(String directory) {

		List<String> fileNames = getFileNames(directory);
		Compiler compiler = new Compiler();

		for (String fileName : fileNames) {

			if (isSourceFile(fileName)) {

				int[] bytecode = compiler.compile(fileName);

				try {
					String compiledFileName = renameSourceToCompiled(fileName);
					BytecodeExporter.export(bytecode, compiledFileName);
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}

	}

	public static List<String> getFileNames(String directory) {

		List<String> fileNames = new ArrayList<>();

		File folder = new File(directory);
		File[] listOfFiles = folder.listFiles();

		for (File file : listOfFiles) {

			if (file.isFile()) {

				fileNames.add(file.getName());
			}
		}

		return fileNames;
	}

	private static boolean isSourceFile(String fileName) {

		return fileName.endsWith("_source.txt");
	}

	private static String renameSourceToCompiled(String fileName) {

		int index = fileName.lastIndexOf("_source.txt");

		if (index == -1) {

			throw new IllegalArgumentException("Invalid file name format: " + fileName);
		}

		return fileName.substring(0, index) + "_compiled.txt";
	}

}
