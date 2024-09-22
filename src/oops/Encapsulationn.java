package oops;

// Wrapping of data (variable) and functions into a single unit. The variables of a class will be hidden from other classes and can be accessed only thru the methods of their current class
// Enc is data hiding (information hiding) to achive encapsulation (data hiding) in java declare variables of a class as private
//Provide public getter and setter methods to modify and view private variables values.
// whenever someone access this setter method and provide variable value then this value is transferred to the global private variable which we can fetch by getter method.
public class Encapsulationn {

	int age;
	String name;
	
	//public void kap(int age) {
	//	System.out.println("age is :" + " "+age);
	//}
	public static void main(String[] args) {
		Encapsulationn obj= new Encapsulationn();
		obj.setAge(50);
	int c=obj.getAge();
	
System.out.println(c);
obj.setName("billu");
System.out.println(obj.getName());


	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
}

   