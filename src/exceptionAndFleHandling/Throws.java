package exceptionAndFleHandling;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class Throws {
	
	public void show() throws FileNotFoundException {
		
		File f = new File("C:\\DumpStack.log");
	FileReader fr= new FileReader(f);
	}

}
