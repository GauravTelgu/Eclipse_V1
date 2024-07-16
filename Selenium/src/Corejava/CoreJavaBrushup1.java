package Corejava;

public class CoreJavaBrushup1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num = 5;
		String Website = "Gaurav Telgu";
		char letter ='g';
		double dec = 5.99;
		boolean mycard = true;

		
		System.out.println(num + " is the value of a number");
		System.out.println(Website);
		System.out.println(letter);
		System.out.println(dec);
		System.out.println(mycard);
		
		//Arrays
		int[] arr = new int[3];
		arr [0]= 9;
		arr [1]= 8;
		arr [2]= 5;
		
		int[] arr2 = {1,2,7,4,5};
		
		//System.out.println(arr[1]);
		//System.out.println(arr2[2]);
		
		//For loop
		
		for(int i=0; i<arr.length; i++)
		{		
	//	System.out.println(arr[i]);
		}
		
		String[] name = {"gaurav", "java", "selenium"};
		//for(int i=0; i<name.length; i++)
		//{		
		//System.out.println(name[i]);
		//}
		
		for( String s :name)
		{
			System.out.print(s);
		}
	}
}
