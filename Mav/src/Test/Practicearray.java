package Test;

public class Practicearray {
		
	public static void main(String[] args) {
	     int[][] a = { 
	     				{1, 2, 3, 4}, {5, 6, 7} 
	                            };
	                            
	     for (int i = 0; i < a.length; i++)    //outer loop
	    	// System.out.println()
	    {
	     for(int j = 0; j < a[i].length ; j++) 	// inner loop
	        {
	           System.out.print(a[i][j]+ " ");
	           
	        }
	         System.out.println();
			
	    }
	}
}

