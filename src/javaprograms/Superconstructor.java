package javaprograms;


public class Superconstructor extends Constructorr {
	String color="black"; // If I want to call Parent variable value then we have to use super keyword in method syso like (super.variable name)
	// During calling parent method in over riding we use super keyword like 
	
	void m1() {
		
		System.out.println(super.color);
		System.out.println(color);

	}
	
	void m2() {
		//System.out.println("child method");
		super.m2(); // we are calling parent method

	}
public static void main(String[] args) {
	Superconstructor ob=new Superconstructor();
	ob.m1();
	ob.m2();
}
}
