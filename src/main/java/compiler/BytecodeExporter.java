package compiler;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class BytecodeExporter implements FileExporter {

	public static void writeToFile(String hexString, String filePath) throws IOException {

		File file = new File(filePath);
		FileWriter fileWriter = new FileWriter(file);
		fileWriter.write(hexString);
		fileWriter.close();
	}

	@Override
	public void export(String content, String fileName) throws IOException {
		
		writeToFile(content, fileName);
	}

}
