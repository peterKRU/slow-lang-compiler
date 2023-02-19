package compiler;

import java.util.Scanner;

public class Runner {

	@SuppressWarnings("unused")
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		while (true) {

			log(ConsoleUtils.DEFAULT_STATIC_MESSAGE);

			String input = scanner.nextLine();

			if (input.equals(ConsoleUtils.EXIT)) {

				break;
			}

			switch (input) {

				case ConsoleUtils.TEST :
					
					Compiler compiler = new Compiler();
					byte[] bytecode = compiler.compileFromFile(ConsoleUtils.DEFAULT_TEST_FILE);
					break;
	
				default :
	
					break;

			}

		}

		scanner.close();
	}
	
	private static void log(String message) {

		System.out.print(message);
	}	
}
