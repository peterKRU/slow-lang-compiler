package compiler;

import java.io.IOException;

public interface FileExporter {
	
	public void export(String content, String fileName) throws IOException;
}
