package javaprograms;


//  JDK : Java deveopment kit is a complete java s/w to create and compile and execute java code, its for java based application development purpose 
//  JRE :Java runtime env is if any java based app I want to install into my system then prereq is you must have jre in system already to run java app, if u
//  install jdk then u will have jre and jvm
//  
//  JVM : jvm is virtual machine which allows to run java programs on any operation system and it converts java programs into machine language it can
//  be any machine and then any OS can understand it so it supports platform independent feature
 

public class Obj_datatypes {

	public void kapil() {

	}

	public static void main(String[] args) {

		int a = 10;
		int b = 20;
		int c = 30;
		
		// Data types and variables
		// variables = are used to hold some value and value can be changed
		// Constant = are used to hold some value and value can't be changed. value can be defined by final keyword. and while 
		//defininf constant it is mandatory to give value against variable.
		//final keyword : If we declare any variable as final then same variable value can't be modified 
		//Final method : If we declare ay method as final then same method can not be over ridden.final void m1(){}
		
		
String s="hello";
 int t=34;
 t=55;
 
	//final int l = 45;
	// l = 33;  here we can not change value of l variable as it is constant

int marks=80;
char v= 'k';
boolean y=true;
float calc =5.6f;
double n= 9.99;



		Obj_datatypes obj = new Obj_datatypes();
		System.out.println("hello world");
		System.out.println(100 + 200);
		System.out.println("100" + 200);
		System.out.println("100" + "200");
		System.out.println("the value of abc is :" +a + b + c);
		System.out.println(a + " " + b + c);
		System.out.println(a + b + " " + c);
		System.out.println(a +"  " + b + " " + c);
		System.out.println(s);
		System.out.println(calc);

		System.out.println(n);
		System.out.println(y);
		System.out.println(v);

		System.out.println();

	}
}

