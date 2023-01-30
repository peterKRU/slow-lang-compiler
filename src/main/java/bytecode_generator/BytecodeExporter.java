package bytecode_generator;

import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;

public class BytecodeExporter implements Exporter {

	@Override
	public void export(int[] content, String filePath) throws IOException {

		try (BufferedWriter writer = Files.newBufferedWriter(Paths.get(filePath))) {

			Arrays.stream(content).mapToObj(Integer::toString).forEach(s -> {

				try {
					writer.write(s);
					writer.write(" ");
				} catch (IOException e) {
					e.printStackTrace();
				}
			});
		}
	}

}
