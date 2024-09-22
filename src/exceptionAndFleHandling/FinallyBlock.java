package exceptionAndFleHandling;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class FinallyBlock {// what task we want to execute at the end then we may write that inside finally block, doesn matter try OR catch is executing or not finally block will run always.
	public void show()  {
//		try {
//		File f = new File("C:\\DumpStackqw222222.log"); // here we have provided invalid file name just to run catch block exception
//		//File f = new File("C:\\DumpStack.log");
//		FileReader fr= new FileReader(f);
//		int i=10;
//		int j=0;
//		int k=i/j;
//		System.out.println(k);
//		}
//		catch(Exception e) {
//			System.out.println("ArithmeticException is coming");
//		}
	
			int a[]= new int[5];
			Scanner ss=new Scanner(System.in);
			System.out.println("enter number");   

			int num=ss.nextInt();
			System.out.println("enter position");   

		int pos=ss.nextInt();
          a[pos]=num;
         //3 System.out.println(a[pos]);
          System.out.println("completed");
          System.out.println("exit number");
//		}
//          catch(Exception e) {
// 			System.out.println("ArithmeticException is coming");
//		}
		
//		finally {
//			System.out.println("hellow world");
//
//		}
}
public static void main(String[] args) {
	FinallyBlock ob=new FinallyBlock();
	ob.show();
	
}
}
