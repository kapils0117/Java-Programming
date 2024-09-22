package fileHandling;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class CharReadBufferedReader {
public void filereaders()  {
		
		File f =new File("C:\\Users\\KSHARM23\\testdata.txt");// To read any file data firstly create connection to file by creating File class Object
		try {
		FileReader fr= new FileReader(f);
BufferedReader bf= new BufferedReader(fr);
char ch[]=new char[40];
fr.read(ch, 1, 3);
System.out.println(ch);
		}
		catch (Exception e) {
			// TODO: handle exception
		}
		
	finally {
		System.out.println("done");
	}
		
}
public static void main(String[] args) {
	CharReadBufferedReader  brr= new CharReadBufferedReader();
	brr.filereaders();
}
}