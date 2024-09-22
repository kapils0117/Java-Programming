package stringHandling;

public class StringMethods2 {
	public static void main(String[] args) {
		// Java String valueOf() Method
		// The String class valueOf() method converts given type such as int, long,
		// float, double, boolean, char and char array into String.

//	int s=20;
//	System.out.println(s+10);
//	String s2= String.valueOf(s);
//	System.out.println(s2+10);
//	
//	double d=2.5;
//	System.out.println(d+10);
//	String s3=String.valueOf(d);
//	System.out.println(s3+2.5);

		// WRAPPER CLASS
		String s4 = "20";
		System.out.println(s4 + 10);
		Integer i = Integer.parseInt(s4);
		System.out.println(i + 10);

		// Java String contains()
		// The Java String class contains() method searches the sequence of characters
		// in this string.
		// And It returns true if the sequence of char values is found in this string
		// otherwise returns false.

//		String name = "what do you know about me";
//		System.out.println(name.contains("do you know"));
//		System.out.println(name.contains("about"));
//		System.out.println(name.contains("hello"));
//		System.out.println(name.contains("About")); // false : case sensitive
//		//Java String endsWith(): this method return true or false 
//		String s5="java by javatpoint";  
//		System.out.println(s5.endsWith("t")); //true
//		System.out.println(s5.endsWith("poin"));  // false
//		
//		
//        String str = "Welcome to Javatpoint.com";  
//        System.out.println(str.endsWith("point"));  
//        if(str.endsWith(".com")) {  
//            System.out.println("String ends with .com");  
//        }else System.out.println("It does not end with .com");  
      //getBytes()method = it return unicode of string 
    	String s1="Hello World Java is to java";  
    	String s2=new String("This is jave is world");
    	
    	//char ch[]= {'a', 'e'};
    	
//    	byte[] b=s1.getBytes();  
//    	for(int j=0;j<b.length;j++){  
//    	System.out.println(b[j]);  
//    	} 
//    	
    	//int y= s2.indexOf('i');//find index position of any char or string
    	//int y= s2.indexOf("is");
    	int y= s2.indexOf("is", 3);
		System.out.println(y);
		

//  String str1 = "To learn Java visit Javatpoint.com";
//if(str1.contains("Javatpoint.com"))
//	{
//		System.out.println("This string contains javatpoint.com");
//	}
//else System.out.println("Result not found");
//
		}

	
	
	 
}



