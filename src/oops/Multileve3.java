package oops;

public class Multileve3 extends Multilelparent2{
	
	public void sub() {
		System.out.println("I am a parent C");
	}
	public static void main(String[] args) {
		Multileve3 obj = new Multileve3();
		obj.mul();
		obj.add();
		obj.sub();
	}

}
