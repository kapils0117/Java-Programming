package condtionalHandlingandLoops;

import java.security.DomainCombiner;
import java.util.Scanner;

public class ElseIfStudentmarks {

	public void marks() {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("enter student marks");
		
		int marks= sc.nextInt();
		if (marks>=0 && marks<=30) {
			System.out.println("fail");
		}
		else if (marks>=30 && marks<=45) {
			System.out.println("passed with third division");
		}
		else if (marks>=45 && marks<60) {
			System.out.println("passed with second division");
		}
		else if (marks>=60 && marks<=79) {
			System.out.println("passed with first div");
		}
		else if (marks>=80 && marks<=100) {
			System.out.println("got merit");
		}
		
		else if (marks<0 || marks>100) {
			System.out.println("Incorrect value");
		}
		
	}
	public static void main(String[] args) {
		ElseIfStudentmarks ob=new ElseIfStudentmarks();
		ob.marks();
		}
}
