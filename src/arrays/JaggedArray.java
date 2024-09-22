package arrays;

public class JaggedArray { //	//Jagged array : here no of columns are not same and we declare the rows not columns in jagged arr.

	//Jagged array declaration and initialization
	public static void main(String[] args) {
//		int a[][]=new int[2][];
//		a[0]=new int[4];
//		a[1]=new int[3];
		
		//a[0][0]=20;
		//a[0][1]=30;
		
		
		int a[][]={{2,4,5,6}, {9,7,8}};   // means it has 2 rows and first rows has length 4, and second row length is 3 and a length is 2, and a[0] length is 4, a[1] length is 3
		
		for (int i=0; i<a.length; i++) {
			for(int j=0;j<a[i].length;j++) {
				System.out.print(a[i][j] + " ");
			}
			System.out.println();
		}

	}
		
}
