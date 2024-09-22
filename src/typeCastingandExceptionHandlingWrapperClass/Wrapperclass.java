package typeCastingandExceptionHandlingWrapperClass;

public class Wrapperclass {// We use wrapper class just to convert String into int, String into double, String into boolean and Int value into String
	
	public static void main(String[] args) {
		//String s = "100";
		//System.out.println(s+20);
		//int i = Integer.parseInt(s);
		//System.out.println(i+20);
		
		//Integer to String conversion
		int k = 20;
		
		String ss= String.valueOf(k);// value of method is used to convert String to any other data type like int, char, etc...
		System.out.println(ss+20);		
	}

}
