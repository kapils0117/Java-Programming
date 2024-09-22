package oops;

public class UpcastingB extends UpcastingA {

	
	public void m1() { // this is overridden method which , In upcasting it will call overridden method which is present inside child class and it can call all methods of parent class.
		
		System.out.println("chile ob");
	}
	
	public void childob() {
		System.out.println("child def");
	}
	
	public static void main(String[] args) {
		UpcastingA obj = new UpcastingB(); // upcasting
		obj.m1();
		obj.m2();
		
		
		UpcastingB obj1= (UpcastingB) obj; // downcasting (here obj is a ref var of parent class and we're casting this in child class bcoz we want to access all methods of child class
             obj1.childob();
	}
}
