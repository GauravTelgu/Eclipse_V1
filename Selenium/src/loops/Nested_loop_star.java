package loops;

public class Nested_loop_star {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int rows=4;
		for(int i = 1; i<=4; i++)
		{
			for(int j = i; j<=4; j++)
			{
				System.out.print("*");
				System.out.print("\t");
				
			}
			System.out.print("\n");
		}
		
		for(int i = 1; i<=4; i++)
		{
			for(int j = 1; j<=i; j++)
			{
				System.out.print("*");
				System.out.print("\t");
				
			}
			System.out.print("\n");
		}
		
	}



		
		
/*
 * // Upper half of the pattern for (int i = rows; i >= 1; i--) { for (int j =
 * 1; j <= i; j++) { System.out.print("*"); } for (int k = 1; k <= 2 * (rows -
 * i); k++) { System.out.print(" "); } for (int j = 1; j <= i; j++) {
 * System.out.print("*"); } System.out.println(); }
 * 
 * // Lower half of the pattern for (int i = 2; i <= rows; i++) { for (int j =
 * 1; j <= i; j++) { System.out.print("*"); } for (int k = 1; k <= 2 * (rows -
 * i); k++) { System.out.print(" "); } for (int j = 1; j <= i; j++) {
 * System.out.print("*"); } System.out.println(); }
 */   }