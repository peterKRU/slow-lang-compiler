package compiler;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class ResourceCompiler {

	@SuppressWarnings("unused")
	public static void compileResources(String directory) {

		List<String> fileNames = getFileNames(directory);
		Compiler compiler = new Compiler();

		for (String fileName : fileNames) {

			if (isSourceFile(fileName)) {

				byte[] bytecode = compiler.compile(fileName);
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

}
