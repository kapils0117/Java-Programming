package stringHandling;

public class PrintOddPositionChars {
	//Print Characters Presented at Odd Positions by Using the charAt() Method
	public static void main(String[] args) {
		String s="Cucumber Gherkin Frameworks";
		
		for(int i=0; i<s.length(); i++  ) {
			if(i%2!=0) 
				//if(i%2==0)  // print even position chars

			{
				System.out.println("Odd chars are" +" " + s.charAt(i));
			}
		}
	}
	
}
