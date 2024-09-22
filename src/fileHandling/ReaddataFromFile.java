package fileHandling;

import java.io.*;
import java.io.FileReader;

// File handling classes: File - super class
//FileReader: Read data char by char 
//FileWriter:
//BufferedReader : read data line by line
//BufferedWriter: write data line be line
//FileInputStream : read data in form of byte
//FileInputStream


//Filehandling metods : canRead: it return boolean T or F,  canWrite() : It return boolean value T or F
//createNewFile(), delete(), exist(), length(), getname(): get file name, mkdir(), List(), Read(), Write(), renameTo(), getAbsolutePath(): file location

public class ReaddataFromFile {  // Read data char by char
public void filereader()  {
	try {
	File f =new File("C:\\Users\\KSHARM23\\testdata.txt");// To read any file data firstly create connection to file by creating File class Object
	try {
	FileReader fr= new FileReader(f); // File reader is class to read the file data
	int i=fr.read(); // ASCII , data is in ASCII int format, read data character by character
			while(i!=-1) { // -1 is end of file
				System.out.print((char)i);  // explicit type casting into char from int
				
			}}
			finally {
				f.getClass();
			}
	}
	
	catch(Exception e) {
		System.out.print("exception can occur: file not found exception");
	}
}
public static void main(String[] args) {
	ReaddataFromFile rf= new ReaddataFromFile();
 rf.filereader();
}
}
