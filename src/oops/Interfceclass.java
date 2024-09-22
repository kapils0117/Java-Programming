package oops;

public class Interfceclass implements Intterface, Interfce2 { //multiple inheritance we can also do like Interface extends classA implements InterfaceB

	
	public void display () {
		
		System.out.println("hello");
	}
	
	public void m1() {
		System.out.println("hi");
	}
	public static void main(String[] args) {
		Interfceclass ob=new Interfceclass();
		ob.display();
		ob.m1();
		System.out.println(Intterface.a);
	}
}
