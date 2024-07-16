package Corejava;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CoreJavaBrushup2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr2 = {1,2,3,4,5,6,7,8,9};
		
		//2,4,6,8,10,12 //Multiples of 2
		
	//	for(int i=0; i<arr2.length; i++)
		for (int a :arr2)
		{
			if(a % 2 == 0)
			{
			System.out.println("This is a multiple of 2 " + " - " + a);
			//break; // to break the for a loop if a specific condition is met at the beginning itself
			}
			else
			{
				System.out.println(a + "is not a multiple of 2");	
			}
		}
		
		//ArrayList  --> comes from a package called util
		//create object of the class --> object.method
		
		ArrayList<String> a = new ArrayList<String>();
		a.add("Gaurav");
		a.add("Telgu");
		a.add("Selenium");
		System.out.println(a.get(2));
		
		System.out.println("////////////////////////////////////");
		
		for (int i=0; i<a.size(); i++)
		{
			System.out.println(a.get(i));
		}
		System.out.println("&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&");
		for (String Val :a)
		{
			System.out.println(Val);
		}
		
		System.out.println("######################################");
		//Item present in arraylist
		System.out.println(a.contains("Slenium"));
		
			
		//Convert Array into ArrayList
		String[] name = {"gaurav", "java", "selenium"};
		List<String> nameArrayList = Arrays.asList(name);   //Arrays.asList converts Array to Arraylist
		System.out.println(nameArrayList.contains("selenium"));
		
		
		
	}
}
