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

				case ConsoleUtils.TEST -> {
					
					Compiler compiler = new Compiler();
					byte[] bytecode = compiler.compile(ConsoleUtils.DEFAULT_TEST_FILE);
				}
	
				default -> {
	
					Compiler compiler = new Compiler();
					byte[] bytecode = compiler.compile(input);
				}

			}

		}

		scanner.close();
	}
	
	private static void log(String message) {

		System.out.println(message);
	}	
}
