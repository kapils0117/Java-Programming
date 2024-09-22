package javaprograms;

//we can call static methods in any class by classname.methodname
// Static variables / methods can be called without creating object of class
// Static variables/methods are used to share data b/w similar multiple objects
//Static methods can access only static members
// In selenium we can use static methods in capturing screenshots feature
// static members of class belongs to class itself rather than object and static methods shared same memory and save memory
// Constructor can't be static
//Static methods always access static variables
// static var are used to share common property of all objects
// static var gets memory only once in class area at the creation of a class 
//we can't use this and super keywords inside static methods
// static var occupies memory in class area and objects occupies memory in heap
//Under a non static methods, static var can't be defined but nonstatic methods can access both static and instance variables.
// Static methods can be called by class name in another class and in same class static methods will be called by class name or without class name
// we can't access instance or non static variables under main method, for that we need to create object and then we can access

public class Staticmethodsandvar {

	/*
	 * int a=10; static String s="java"; static int i=90; public static void show()
	 * { System.out.println("hello java"); } }
	 * 
	 * public void kap() { System.out.println("hi"+ " " +a); System.out.println(s);
	 * } public static void main(String[] args) { //show();
	 * //Staticmethodsandvar.show(); //System.out.println(s); 
	 * obj.kap(); System.out.println(obj.a);
	 * System.out.println(i); //here we can access static variables directly but if
	 * we removes static keyword then we can't }
	 */
	
	
	int emp_id;
	String name;
	static String company="HCL"; // here all objects will share this common property as it is static

	public void ds() {
       ms();
		System.out.println(emp_id+ " " +name+ " " +company);
	}
	public void ms() {
		System.out.println("yellow");
	}
	
	public Staticmethodsandvar(int emp_id, String name) {
		
		this.emp_id=emp_id;
		this.name=name;
		
		
		System.out.println(emp_id+ " " +name+ " " +company);

	}
	public static void main(String[] args) {
		Staticmethodsandvar obj=new Staticmethodsandvar(2, "kapil"); 
		
		 Staticmethodsandvar obj1=new Staticmethodsandvar(33, "rahul"); 
		 obj.ds();

	}

	
}
