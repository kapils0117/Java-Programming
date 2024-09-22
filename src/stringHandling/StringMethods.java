package stringHandling;

public class StringMethods {

	public static void main(String[] args) {
//		String s1=new String("java"); //== methods compare objects address not value
//		String s2=new String("java");
//		System.out.println(s1==s2);
//		
//		String s3=new String("java");
//        String s4="java";
//        System.out.println(s3==s4);
//        
//        String s5="java";
//        String s6="java";
//        System.out.println(s5==s6);
        
        //.equalsTO() = compare string values
//        String s7=new String("Java");
//    	String s8=new String("java");
//        System.out.println(s7.equals(s8));
//        System.out.println(s7.equalsIgnoreCase(s8));
//		char ch[]= {'a','e','i','o','u'};
//		String s9=new String(ch);
//		System.out.println(ch);
//		System.out.println(ch.length);
		//Compare to method, it compare based on unicode value difference
			String s1="hello";  
			String s2="hello";  
			String s3="meklo";  
			String s4="hemlo";  
			String s5="flag";  
			System.out.println(s1.compareTo(s2));//0 because both are equal  
			System.out.println(s1.compareTo(s3));//-5 because "h" is 5 times lower than "m"  
			System.out.println(s1.compareTo(s4));//-1 because "l" is 1 times lower than "m"  
			System.out.println(s1.compareTo(s5));//2 because "h" is 2 times greater than "f"  
			
//		
//		String s10= new String("I am kapil");
//	String s12[]=s10.split("am");
//	System.out.println(s12[1].trim());
//		
//String Concatenation in Java :By + (String concatenation) operator and By concat() method
//		   String s13=50+30+"Sachin"+40+40;  
//		   System.out.println(s13);//80Sachin4040  
//            
//		   String s1="Sachin ";  
//		   String s2="Tendulkar";  
//		   String s3=s1.concat(s2);  
//		   System.out.println(s3);//Sachin Tendulkar  
		   
		   //substring methods
		   String s="SachinTendulkar";   // String substring(int startIndex):
		   int x= s.length();
		  // String substring(int startIndex, int endIndex):
		   try
		   {
			   System.out.println("Substring starting from index 6: " +s.substring(14));//Tendulkar    
			   System.out.println(s.length());
			   System.out.println(s.charAt(x-1));
		   }
		  
		   catch (Exception e) {
				// TODO: handle exception
				System.out.println("exception indexoutofbound");
	}
		   
		   System.out.println("Substring starting from index 0 to 6: "+s.substring(0,10)); //Sachin  
		   System.out.println(s.toUpperCase());//          toUpperCase
		   System.out.println(s.toLowerCase());//          toLowerCase
	        System.out.println(s.charAt(2));//             charAT()
	        System.out.println(s.startsWith("da"));//      false    
	        System.out.println(s.endsWith("r"));//         true  
	        System.out.println(s.length());//              length

	}}
