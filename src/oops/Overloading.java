package oops;

//It is also called ru
public class Overloading {

	public void show() {
		System.out.println("hello");
	}

	public void show(int a, int b) {
		int c = a + b;
		System.out.println(c);
	}

	public void show(int a, int b, int c) {
		int d = a + b + c;
		System.out.println(d);
	}

	public void show(int a, float b) {
		int c = a + (int) b;
		System.out.println(c);
	}

	public void show(float a, float b) {
		System.out.println(a + b);
	}

	public static void main(String[] args) {
		Overloading obj = new Overloading();
		obj.show();
		obj.show(3, 3);
		obj.show(3, 3);
		obj.show(3, 3, 3);
		obj.show(3, 5);

	}
}
