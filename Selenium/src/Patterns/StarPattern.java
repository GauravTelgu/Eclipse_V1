package Patterns;

public class StarPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		for(int i =1; i<=4; i++) 
		{
			for(int j =i; j<=4; j++) 
			{
				System.out.print("*");
				System.out.print("\t");
			}
			System.out.print("\n");
		}
		for(int i =1; i<=4; i++)
		{
			for(int j =1; j<=i; j++)
			{
				System.out.print("*");
				System.out.print("\t");
			}
			System.out.print("\n");
			}
		}
}


