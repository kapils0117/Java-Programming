package fileHandling;

import java.io.File;
import java.io.IOException;

public class CreateaFile {
	public static void main(String[] args) throws IOException  {
		
		File ff=new File("C:\\Users\\KSHARM23\\kapil.txt");
		ff.createNewFile();
		
		System.out.println("filecreated successfully");
		
		if(ff.exists()) {
			System.out.println(ff.getName()); // to check fle name
			System.out.println(ff.getAbsolutePath()); // to check file location
			System.out.println(ff.canWrite());
			System.out.println(ff.canRead());
			System.out.println(ff.length());
		}
		else {
			System.out.println("file doesn't exixt");
		}
		
	}

}
