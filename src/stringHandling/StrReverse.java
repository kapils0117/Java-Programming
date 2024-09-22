package stringHandling;

public class StrReverse {
	
	
public static void main(String[] args) {
	String str= "youtube";
			String str1= "";
			int j = str.length();
			System.out.println(j);
	
    System.out.println("Original string: " + str);
        
//    for (int i = 0; i < str.length(); i++) {
//    	str1 = str.charAt(i) + str1;
//    }
    
    
    for (int i=j-1; i>=0;i--) {
   // str1=str1+str.charAt(i);
    str1=str1+str.charAt(i);

    	}
    
    System.out.println("Reversed string: "+ str1);
    
    
    
  }

	}

	


	
