package fileHandling;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;

public class WriteFileWithBufferedWriter { //we need to pass this backward slash n in file writer only but not in buffered writer
	
	public void writefile( String data) { // providing argument and then user can provide data at run time also
		try {
		File f=new File("C:\\Users\\KSHARM23\\Desktop\\sterilizer\\test.txt");		

		System.out.println("filecreated");
		//FileWriter fww= new FileWriter(f);// it will delete old data of file
		FileWriter fww= new FileWriter(f, true);
		BufferedWriter wb = new BufferedWriter(fww);
		wb.newLine();

		wb.write(data);
		wb.flush();
		wb.close();
		}
		
		catch (Exception e) {
			// TODO: handle exception
		}
}
public static void main(String[] args) {
	WriteFileWithBufferedWriter  wn=new WriteFileWithBufferedWriter();
	wn.writefile("database");
	
}	
}
