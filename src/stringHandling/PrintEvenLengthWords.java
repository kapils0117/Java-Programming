package stringHandling;

import java.util.Scanner;

public class PrintEvenLengthWords {
public static void main(String[] args) {
	
	
	
String s = new String("my name is java sd");
	
	//String s= "My name is Java World";
	String s1[]= s.split(" ");
	for (int i=0; i<s1.length; i++) {
	if (i%2!=0) {
		System.out.println(s1[i]);
		System.out.println("prin this"  + "print next line");
		System.out.println("test"  +'\n' + "test next line"); 
	}
}
	

	
}}	
	

