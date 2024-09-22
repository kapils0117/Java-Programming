package fileHandling;

import java.io.File;
import java.io.FileReader;

public class ReaddataFromeFilecharbychar {
	// File handling classes: File - super class
	//FileReader: Read data char by char 
	//FileWriter:
	//BufferedReader : read data line by line
	//BufferedWriter: write data line be line
	//FileInputStream : read data in form of byte
	//FileInputStream


	//Filehandling metods : canRead: it return boolean T or F,  canWrite() : It return boolean value T or F
	//createNewFile(), delete(), exist(), length(), getname(): get file name, mkdir(), List(), Read(), Write(), renameTo(), getAbsolutePath(): file location

	
	public void filehan() {
		try {
		File f = new File("C:\\Users\\KSHARM23\\kapil.txt");
	
		if(f.exists()) {
			System.out.println("file is there");
		}
			FileReader fr=new FileReader(f);
			try {
				int i;
				while((i=fr.read())!=-1) {
					System.out.print((char)i);
				}
				
			}
			
			finally {
			fr.close();
			}

	}
		catch (Exception e) {
              System.out.println("IO Exception handled");		

		}
		}
		
		public static void main(String[] args) {
			ReaddataFromeFilecharbychar bb= new ReaddataFromeFilecharbychar();
			bb.filehan();
		}
	}

