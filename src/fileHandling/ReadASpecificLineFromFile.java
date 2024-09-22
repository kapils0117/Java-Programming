package fileHandling;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class ReadASpecificLineFromFile {

	
	public void readoddlines()  {

		File f =new File("C:\\Users\\KSHARM23\\testdata.txt");// To read any file data firstly create connection to file by creating File class Object
		try {
		FileReader fr= new FileReader(f);
	BufferedReader bf= new BufferedReader(fr);
	//String ss;
	String ss= bf.readLine();
	ss=bf.readLine();
	while(ss!=null) {
if(ss.contains("armaani") || ss.contains("ARMAANI")) {
	System.out.println(ss);
	ss=bf.readLine();
	

	//ss=bf.readLine();
 

		}

}
		}
		catch (Exception e) {
			// TODO: handle exception
		}
	}

	public static void main(String[] args) {
		ReadASpecificLineFromFile ev=new ReadASpecificLineFromFile();
		ev.readoddlines();
}}
