package fileHandling;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class BufuredReaders { // Read data line  by line
	
	//Two methods are there two read data using buffered reader class and it depends on file reader class
	//first is String readline() method and
	// second is using int read(char[] cbuf, int off(index position), int length), it reads characters into a portion of an array.

	
	public void filereaders()  {
		
		File f =new File("C:\\Users\\KSHARM23\\testdata.txt");// To read any file data firstly create connection to file by creating File class Object
		try {
		FileReader fr= new FileReader(f);
BufferedReader bf= new BufferedReader(fr);
//String ss;
String ss= bf.readLine();
// it reads line by line so will store in String
//while((ss= bf.readLine())!=null)// no need to provide ss=bf.readline (to move to the next line)
	while(ss!=null)
{
	System.out.println(ss);
	ss= bf.readLine();
	
}
	bf.close();
		}
catch (Exception e) {
System.out.println("exception occurs");
}
		}
	public static void main(String[] args) {
		BufuredReaders bb= new BufuredReaders();
		bb.filereaders();
	}
	}