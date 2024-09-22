package arrays;

public class TwoDimensionalArr {
public static void main(String[] args) {
	//Mtarix array declaration and initialization
	int a[][]=new int[2][3]; //It is matrix array, It means 2 rows and 3 columns , 2D matrix array here no of rows and columns are same
	
	a[0][0]=4;
	a[0][1]=5;
	a[0][2]=8;
	a[1][1]=9;
	a[1][0]=7;
	a[1][2]=10;
	
	//OR We can create, declare and initialize an 2D array like this also
	//int [][]a = {3,4,5}, {6,7,8};// 2 rows and 3 columns, array length is 2, first and second row length is 3
	
	//System.out.println(a[0][1]);
	
	for(int[] i:a) {
		
		for (int j : i)
		System.out.println(j);
	}
	
	
}
}
