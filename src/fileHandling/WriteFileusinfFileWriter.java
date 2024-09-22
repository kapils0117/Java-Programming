package fileHandling;

import java.io.File;
import java.io.FileWriter;

public class WriteFileusinfFileWriter {

	//public void writefile() {
		public void writefile( String data) { // providing argument and then user can provide data at run time also
		try {
		File f=new File("C:\\Users\\KSHARM23\\Desktop\\sterilizer\\test.txt");
		f.createNewFile();
		

		System.out.println("filecreated");
		//FileWriter fww= new FileWriter(f);// it will delete old data of file
		FileWriter fww= new FileWriter(f, true);// it will not delete old data if we use true
		//fww.write("hi java yes"); 
		fww.write(data);
		fww.flush();
		fww.close();

	}
		catch(Exception e) {
			System.out.println("file");
		}
		
		
}
public static void main(String[] args) {
	WriteFileusinfFileWriter  fw=new WriteFileusinfFileWriter();
	//fw.writefile();
	fw.writefile("\nmy name is lakahan"); // we need to pass this backward slash n in file writer only but not in buffered writer
}	
}
