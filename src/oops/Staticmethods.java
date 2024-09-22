package oops;

import java.security.DomainCombiner;

public class Staticmethods {

	//int rollno;
	//String name;
	//String standard;
	
	public void show(int rollno, String name, String standard) {
		System.out.println("Roll no is:" +rollno + "name is:" +name+ "standard is:" +standard);

	}
	public static void main(String args[]){  
Staticmethods ob=new Staticmethods();
ob.show(22, "heh", "wewe");}
}