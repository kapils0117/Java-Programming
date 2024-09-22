package oops;

public class InheriB extends InheritanceA{
	public void mul(int a, int b)
	{
		int c =a*b;
}	
	public void add(int a, int b)
	{
		int c =a-b;
		System.out.println(c);
}
	public static void main(String[] args) {
		InheriB b1=new InheriB();
		b1.add(2, 3);
		InheritanceA bb=new InheritanceA();
		bb.add(3, 2);
	}
	
	//Types of Inheritance : 1, Single inheritance, 2. Multilevel, if there are three classes A, B and C and class b extends class A and class C extends class B then by creating object of class C we can access members of class B and C
	// Hierarchical Inher: Parents class can have multiple child class for eg class B can extends Parent class A and class C also extends Class A 
   //Multiple Inher: A single class has multiple parents so directly mul inh is not acheived, we can achive it by interface
	// Inheritance advantage is it avoids code duplicacy and provide re-usability feature
	//If parent and child class both have same methods then we can call child class method only by creating child class object
// and by creating object of parent class we can call only parent class method

}
