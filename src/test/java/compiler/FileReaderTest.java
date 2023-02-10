package compiler;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assumptions.assumeTrue;

import java.io.FileNotFoundException;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class FileReaderTest {

    @Test
    @DisplayName("Test importFile method")
    public void testImportFile() {
        
    	FileReader fileReader = new FileReader();
    	String importedFile = fileReader.importFile("test_source.txt");
    	
    	assumeTrue(!importedFile.isEmpty());
    	assertTrue(importedFile.charAt(0) == 'm');
    }
        
    
    @Test
    @DisplayName("Test FileNotFoundException with non-existent file name: should throw FileNotFoundException")
    public static void testImportWithMissingFile() throws FileNotFoundException {
        
    	FileImporter fileReader = new FileReader();
    	fileReader.importFile("missingFile");
    	
        assertThrows(FileNotFoundException.class, () -> FileImporterTest.testImportWithMissingFile());
    } 

}
