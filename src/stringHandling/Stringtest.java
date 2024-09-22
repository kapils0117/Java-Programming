package stringHandling;

import java.nio.file.spi.FileSystemProvider;

public class Stringtest {
	public static void main(String[] args) {
		//SCP is one memory location inside heap memory
		String s = new String("kapil");// It will create 2 objects, one in heap and other in SCP
	String s2= "java"; //it is string literal & will create only one object inside SCP
//System.out.println(s);
//		System.out.println(s);
//		System.out.println(s2);
		
		char ch[]= {'a','e','o','i','u'};
		//for(char c:ch) {
		for(int i=0;i<ch.length;i++) {
		
		
		System.out.println(ch[i]);
		
		}
	
	
	}}

