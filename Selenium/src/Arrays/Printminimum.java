package Arrays;

public class Printminimum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	//int min=0;	
		int a[][]= {{2,4,5},{3,4,7},{1,8,9}};
		int min = a[0][0];
		
		for(int i=0; i<3;i++) 
		{
			for(int j =0; j<3;j++) 
		{
			if(a[i][j]<min)  // min = a[0][0] --> min = 2
				{
				
				min = a[i][j];
			}
		}
			
			//System.out.print("\n");
	} 	System.out.print(min);
	
	}
}