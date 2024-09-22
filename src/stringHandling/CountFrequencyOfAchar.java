package stringHandling;

public class CountFrequencyOfAchar {

	public static void main(String[] args) {
		
		String s = "India is the world leader now";
		int count =0;
		for(int i=0; i<s.length(); i++) {
			if(s.charAt(i)=='e') {
			
				count++;
				
		}
			
	}
		System.out.println(count);
				
			}
}
