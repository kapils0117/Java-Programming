package exceptionAndFleHandling;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;


// Checked(complile time) and uncheked exception(run time)
// Under a try block we can have multiple catch block
// We can avoid catch block and can use only Finally block with Try block but n case of unchecked exceptions only
//checked exc- IO file not found exce
//Unchecked- arithmetic exc, null pointer excep
//Stale elemnt exception - when we want to click on any link but we are on other page 

public class ExceptionPrentClass {

	public void show()  {
		try {
//		File f = new File("C:\\DumpStack.log"); // here we have provided invalid file name just to run catch block exception
//		//File f = new File("C:\\DumpStack.log");
//		FileReader fr= new FileReader(f);
		int i=10;
		int j=0;
		int k=i/j; // unchecked or run time exception will occur
		System.out.println(k);
		}
//		catch(ArithmeticException e) {
//			System.out.println("ArithmeticException is coming");
//		}
//	
//		catch(FileNotFoundException e) {
//			System.out.println("FileNotFoundException is coming");
//		}
		finally {
	System.out.println("hellow world");
}}
public static void main(String[] args) {
	ExceptionPrentClass ob=new ExceptionPrentClass();
	ob.show();
}
}
