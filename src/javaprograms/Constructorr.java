package javaprograms;

public class Constructorr {
	//Constructor is just like method and we can use constructor as a prereq like to start n close the browser
	//Constructor name is same as class name
	//Constructor will be called when object is created
	//Whatever action we want to perform first then we can use Constructor there.
	// Constructor has no return type
	//Constructor can take arguments
	
	
		String color="white";
		
		void m1() {
			System.out.println(color);
		}
		
		void m2() {
			System.out.println("parent method");
		}
	
	public Constructorr(){
		
		System.out.println("parent default");
	}
	
	public Constructorr(String a) {
	
		System.out.println("parent one param constructor");
	}

	public Constructorr(String a, int b) {
		System.out.println(" parent two param constructor");
	}
	

	
}
