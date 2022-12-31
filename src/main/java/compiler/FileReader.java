package compiler;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileReader {

	public static String readFile(String fileName) {

		File file = new File(fileName);
		Scanner scanner;

		try {
			scanner = new Scanner(file);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
			return null;
		}

		StringBuilder stringBuilder = new StringBuilder();

		while (scanner.hasNext()) {
			String token = scanner.next();
			stringBuilder.append(token).append(" ");
		}

		scanner.close();

		return stringBuilder.toString();
	}

}
