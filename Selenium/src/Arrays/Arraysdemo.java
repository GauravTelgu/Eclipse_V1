package Arrays;

public class Arraysdemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// A container which stores multiple values of same data type
		
		int a [] = new int [5];				// new - allocates memory (5 integer values can be stored in array a)
											//Declares and array and allocates memory for the values
		
		a[0] = 2;
		a[1] = 5;
		a[2] = 9;
		a[3] = 21;
		a[4] = 14;
		
		int b[] = {1,5,8,13,25};
		
		for(int i = 0 ; i <a.length; i++) 
		{
			System.out.println(a[i]);
		}
		
		for(int i = 0 ; i <b.length; i++) 
		{
			System.out.println(b[i]);
		}
		
	}

}
