package bytecode_generator;

import java.io.IOException;

public interface Exporter {
	
	public void export(int[] content, String filePath) throws IOException;
}
