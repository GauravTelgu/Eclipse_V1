package Test;

public class Array {

	public static void main (String args[]) {
	int [] s= new int[25];
	int [] a= new int[] {1,2,3,4,5};
	int b[]= {5,6,7,8,9};
	int [][] multi = {
		{1,7,6},
		{3,4,5},
		{5,6,8}
					};
	System.out.println(a[2]); 
	System.out.println(b[3]);
	System.out.println(s.length);
	for(int i=0;i<multi.length;i++) {
		for(int j=0;j<3;j++) {
	System.out.print(multi[i][j]);
		}
		System.out.println("\n");
	}
	}
}