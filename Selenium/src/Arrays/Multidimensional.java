package Arrays;

public class Multidimensional {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//a [row] [column]
		
			
		int a [][] = new int [2][3];
		
		a [0][0]= 2;
		a [0][1]= 4;
		a [0][2]= 8;
		a [1][0]= 3;
		a [1][1]= 6;
		a [1][2]= 9;
		
		// int a[][] = {{2,5,8},{6,9,7}};
		
		for(int i=0; i<2;i++) 
		{
			for(int j =0; j<3;j++) 
		{
			System.out.print(a[i][j]);
			System.out.print("\t");
		}
			System.out.print("\n");
		}
	}

}