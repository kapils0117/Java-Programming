package javaprograms;
//methods: A method is a block of code which only runs when it is called. You can pass data, known as parameters, into a method. 
//Methods are used to perform certain actions, and they are also known as functions.A method is a block of code or collection of statements or a set of code grouped together to perform a certain task or operation. 
//It is used to achieve the reusability of code. We write a method once and use it many times.
public class methodswitharguments {

	
	
	// Methods no return and no arg
	public void hello() {
		System.out.println("hi");
		String s= "kapil sh";
		
	}
	
	
	// Method with return but no arguments
	
	public String  hi() {
		return "java";
	}
	
	// Method with no return but having  arguments
	public void  hi(int a, int b) {
		int c = a+b;
		System.out.println(c);
	}
	// Method with return and having  arguments also
	
	public String  show(String k) {
		return k;
	}
	
	
	public int add ( int a, int b) {
		int c =a+b;
		return c;
	}
	public int sub(int a, int b) {
		int d=a-b;
		return d;
	}
	public void mul (int a, int b)
	{
		int t= a*b;
		System.out.println(t);
		
		
	}
	public static void main(String[] args) {
		methodswitharguments ob= new methodswitharguments();
				int z= ob.add(2, 4);
				int y= ob.sub(4, 2);
				ob.mul(z, y);
				System.out.println(z); 
				ob.hello();
				System.out.println(ob.hi());
			ob.hi(3, 4);
System.out.println(ob.show("kapil"));			
	}
}

