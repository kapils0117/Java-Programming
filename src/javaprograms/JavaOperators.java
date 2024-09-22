package javaprograms;

public class JavaOperators {

	int a = 10;
	int b = 20;

	int result = a + b;

	//Types of operators-----------------------
	//1)Arithmetic operators+-*/%
    //2)Relational/comparison operators>>=<<=!===
   // 3)Logical operators    &&||!
   // 4)Increment&Decrement operators  ++ --
    //5)Assignment=+=-=*=/=%=
	//6)conditional/ternary operator  ?:

	//1)Unary operators  ++,--+=-=*=/=%=!=2)
	//Binary operators +-*/%>>=<<=!===&&||3)
	//Logical operators---------------
	//&&, || OR

	//Assignment-------1)swapping of two numbers
	public static void main(String[] args) {
		int a = 20, b = 10;

		//1)Arithmetic operators+-*/%
		System.out.println("sum is" + (a + b));
		System.out.println("subtraction is" + (a - b));
		System.out.println("multiplication is" + (a * b));
		System.out.println("division is" + (a / b));
		System.out.println("mod is" + (a % b));

		//Relational operators and return true or false
		System.out.println(a <= b);
		System.out.println(a >= b);

		System.out.println(a == b);
		System.out.println(a != b);
		System.out.println(a = b);
		System.out.println(a>b);
		System.out.println(a<b);
		
		//Logical operators    &&||! and return true or false
		
		boolean x= true;
		boolean y= false;
		System.out.println(x&&y);
		System.out.println(x||y);
		System.out.println(!x);
		
		boolean b1= 10>20;
		boolean b2=20>10;
		System.out.println(b1&&b2);
		System.out.println(b1||b2);
		
		// Increment / decrement operators
		
		//a++ or a=a+1 // post increment op
		//++a // pre increment op
		a=1;
		//a++;
		
		//int res= ++a;
		int res=a++;
		System.out.println(a);
		System.out.println(res);

		
		
		
	}
	
}
