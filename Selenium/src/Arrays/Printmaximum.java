package Arrays;

public class Printmaximum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[][]= {{2,4,5},
					{3,4,7},
					{1,8,9}};
		
		int max = a[0][0];
		
		for(int i=0; i<3;i++) 
		{
			for(int j =0; j<3;j++) 
		{
			if(a[i][j]>max)  // max = a[0][0] --> min = 7
				{
				max = a[i][j];
				
				//break;			
	
//The break statement inside the if block causes the inner loop to terminate prematurely,
//which means that only the first maximum in each row is considered. This can lead to incorrect results. 
//The correct way to find the maximum value is to compare all elements in the array without breaking the loop.
				
				//min = a[i][j];
				}
			
		}
			//System.out.print("\n");
	}System.out.println("The maximum number is" + " " + max);

	}
}
