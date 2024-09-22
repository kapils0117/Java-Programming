package exceptionAndFleHandling;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class TryCatch {

		
public void show()  {
		try {
		//File f = new File("C:\\DumpStackqw222222.log"); // here we have provided invalid file name just to run catch block exception
		File f = new File("C:\\DumpStack.log");
		FileReader fr= new FileReader(f);
	}
		catch(FileNotFoundException e) {
			System.out.println("FileNotFoundException is coming");
		}
		
		catch(Exception e) {
			System.out.println("exception is coming");
		}
		
		
	System.out.println("hellow world");
}
public static void main(String[] args) {
	TryCatch ob=new TryCatch();
	ob.show();
}
}
