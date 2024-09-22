package condtionalHandlingandLoops;

import java.util.Scanner;

public class Ifelse {

	//public static void main(String[] args) {
		public void m3() {
		Scanner scan= new Scanner(System.in);
		System.out.println("enter first number");
		
		int num= scan.nextInt();
		/*
		 * System.out.println("enter second number"); int nn=scan.nextInt();
		 * 
		 * 
		 * 
		 * if(num>=nn) { System.out.println("correct"); } else {
		 * System.out.println("incorrect"); }
		 */
		
		if(num%2==0) {
			System.out.println("number is even");
		}
		else {
			System.out.println("number is odd");

		}
	}
		public static void main(String[] args) {
			Ifelse ob=new Ifelse();
			ob.m3();
		}
}
