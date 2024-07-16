package Arrays;

public class CiscoInterview {

	//Find the minimum number
	//Identify the column of minimum number
	//Find max no. in identified column
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	//int min=0;	
		int a[][]= {{2,4,5},{3,0,7},{1,8,9}};
		int min = a[0][0];
		int mincolumn = 0;
		
		for(int i=0; i<3;i++) 
		{
			for(int j =0; j<3;j++) 
		{
			if(a[i][j]<min)  				// min = a[0][0] --> min = 2
				{
				
				min = a[i][j];    			//--> 0 is stored here  [1][1] = 0
				mincolumn = j;
			}
		}
			
			
	}
		int max = a[0][mincolumn];
		int i=0;
		while(i<3) 
		{
			if(a[i][mincolumn]>max)
			{
			max =a[i][mincolumn];
		}
		i++;
	}
		System.out.println(max);
}
}


