package oops;


// In interface we can't create concrete methods (with body) only interface contain abstract methods but we don't need to specify abstract keyword its by default abstract
//Interface variables are always static, final and public, we dont need to specify static and final keyword.
//Interface can also contain concrete methods but it should be default
//All mthods inside interface are public and abstract and no need to specify public and sbtract keyword
//we cant declare interface variables as private and protected
// we can't create object of abstract class and interface therefore child class inherit abstract class n interface and provide implementation.
// In interface we create abstract methods without body bcoz for future so that each team member can follow same methods name
// Child class inherit interface by 'Implements' keyword
public interface Intterface {
	
//	int b;            X - every variable in interface is final means we need to provide value to the variable
	int a=5;
	
 void display(); // it is public and abstract method by defualt.

		default void show() {
			
			
		}
		}


