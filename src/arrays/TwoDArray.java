package arrays;

public class TwoDArray {
public static void main(String[] args) {
	int a[][]= {{2,3,5}, {4,7,8,9}};
	//String a[]= new String[10];
	for (int i=0; i<a.length; i++) {
		for(int j=0;j<a[i].length;j++) {
			System.out.print(a[i][j]);
		}
		System.out.println();
	}
	
}
}
