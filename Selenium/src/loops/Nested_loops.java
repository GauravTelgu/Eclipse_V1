package loops;

public class Nested_loops {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int k =10; 
		
		for (int i=1; i<=4; i++)
		{
			//System.out.println(i);
		
		
			for( int j=0; j<=4-i; j++)				// 1
			{
				//System.out.print(i);
				//System.out.print(j);
				System.out.print(k);	
				System.out.print("\t");
				k--;								//2
			}
			System.out.print("\n");
		}
		
	}

}
