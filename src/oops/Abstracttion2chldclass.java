package oops;

public class Abstracttion2chldclass extends Absttraction{


	public void kap() {
		System.out.println("hello");
	}

	
	public void sum(int a, int b) {
		System.out.println(a+b);
	}
	public static void main(String[] args) {
		Abstracttion2chldclass ob = new Abstracttion2chldclass();
		ob.sum(2, 4);
		ob.kap();
	}

}
