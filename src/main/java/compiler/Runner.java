package compiler;

public class Runner {

	@SuppressWarnings("unused")
	public static void main(String[] args) {


		String fileName = "test_classes_source.txt";
		Compiler compiler = new Compiler();

		int[] bytecode = compiler.compile(fileName);
	}

}
