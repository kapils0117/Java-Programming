package oops;


public abstract class Absttraction { // abstract class
	// Abs is details hiding (implementation hiding) Abst is a process to hiding the implementation details and showing only the functionality to user, Abstraction is used for data hiding and rule implementation. we can achieve abstraction by creating Abstract and concrete methods n class
//In interface the child class which inherit the interface, all methods of child class should be public
//All methods in an interface will be public and abstract by default and no need to mention public and abstract keyword
// Concrete method : which is declared and also defined means has body and class which has only concrete method is concrete class
	
	//Abstract method: we only declare the method but don't provide body or defined it
//Abstract class: the class which has atleast one abstract method is called abstract class.we can create abstract method by abstract keyword.
//We can not ceate object of an abstract class. Abstract class can inherit by using extend keyword
	// WE create abstract class just to follow a single structure or pattern of method implementation so we create absrract methods which can be inherited by other members
//Interface can be inherited by implement keyword.
	
	
public void hello() { // Concrete method- has body
	System.out.println("hi");
}

public abstract void  kap();//abstract method- no body

public abstract void sum(int a, int b);




}

