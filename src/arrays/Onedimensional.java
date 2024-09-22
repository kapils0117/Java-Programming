package arrays;

public class Onedimensional { // array is a similar type of objects that holds fixed number of values of similar type elements. it store data in heap memory
	//Length of an array has to be declared at the time of array creation.

	public static void main(String[] args) {
		int[] a = new int[5]; // array declaration and creation in single line, creating array object , a
		 int b[]= {4,8,2,1,9,2,5,3,4,3}; // array declaration, creation and initialization in a single line
		 
		 
//		a[0]=2;
//		a[1]=4;
//		
//		for (int i=0; i<a.length; i++) { // for loop
//			System.out.println(a[i]);
//		}
//		for (int i:a) {   // for each loop
//			System.out.println(i);
//		}
		
		for (int c:b) {
			System.out.println(c);
		}
		System.out.println(b.length);

	
		
		
	}
	
	
}
