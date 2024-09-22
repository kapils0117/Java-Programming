package stringHandling;

public class StringMethods3 {

	//Java String isEmpty() and returns true if string is  empty and false it is not emptypublic static void main(String args[]){  
	public static void main(String args[]){  
		String s1="";  
		String s2="javatpoint";  
		  
	//	System.out.println(s1.isEmpty());  
	//	System.out.println(s2.isEmpty());  
		
		//startsWith():  checks if this string starts with the given prefix method, considers the case-sensitivity of characters
		String s3="java string split method by javatpoint";    
		System.out.println(s3.startsWith("ja"));  // true  
		System.out.println(s3.startsWith("java string"));   // true  
		System.out.println(s3.startsWith("Java string"));  // false as 'j' and 'J' are different   
		System.out.println(s3.startsWith("is"));	
		
//replace() method returns a string replacing all the old char or CharSequence to new char or CharSequence.
		
		//syntax : replace(char oldChar, char newChar)   
		String replaceString=s3.replace('a','e');//replaces all occurrences of 'a' to 'e'  
		System.out.println(replaceString);  
		
		
		
		
	}  
		
		
		
		
}
