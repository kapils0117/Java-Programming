package oops;

public class Overriding2 extends Overridiing{
	public void sum(int a, int b) {
		int c = a*a-b*b;
		System.out.println(c);
	}
	public void mul(int a, int b) {
		int c = a*b;
		System.out.println(c);
	}
	public static void main(String[] args) {
		Overriding2 obb= new Overriding2();
		obb.sum(4, 2);
		obb.sub(5, 4);
		obb.mul(2, 2);
	}
}
