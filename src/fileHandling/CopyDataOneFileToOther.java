package fileHandling;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

public class CopyDataOneFileToOther {

	public void display() {
		File f1 = new File("C:\\Users\\KSHARM23\\Desktop\\sterilizer\\test.txt");// To read any file data firstly create
																					// connection to file by creating
																					// File class Object
		File f2 = new File("C:\\Users\\KSHARM23\\Desktop\\sterilizer\\data.txt");
		File f3 = new File("C:\\Users\\KSHARM23\\Desktop\\sterilizer\\kap.txt");

		try {
			FileReader fr1 = new FileReader(f1);
			BufferedReader bf1 = new BufferedReader(fr1);
			FileReader fr2 = new FileReader(f2);
			BufferedReader bf2 = new BufferedReader(fr2);
			FileWriter fw3 = new FileWriter(f3);
			BufferedWriter bf3 = new BufferedWriter(fw3);

			String s1 = bf1.readLine();
			while (s1 != null) {
				fw3.write(s1);
				s1 = bf1.readLine();
				bf3.newLine();
				
			}				
				String s2 = bf2.readLine();
				while (s2 != null) {
					fw3.write(s2);
					s2 = bf2.readLine();
					bf3.newLine();
				
					System.out.println("file copied");
				}
				bf3.flush();
				bf3.close();
				
			}

			
		 catch (Exception e) {
			// TODO: handle exception
		}
	}
	public static void main(String[] args) {
		CopyDataOneFileToOther cd= new CopyDataOneFileToOther();
		cd.display();
	}
}
