package Corejava;

public class CoreJavaBrushup3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//String can be in two ways using String literals and new memory allocate operator
		
		//String is an object that represent sequence of characters
		//String Literal
		String s = "Gaurav telgu";		// --> Will not create a new memory allocation if values are same
		//String s1 = "Gaurav telgu";
		//String s4 = "GT";				// --> Will create a new memory allocation as it has new value
		
		
		//new keyword (Creates an object every time)
		//String s2 = new String("Java");		// --> Even if values are same a new memory location will be created
		//String s3 = new String("Java");
		
		String s7 = "Gaurav";	
		String[] spilttedString = s7.split("Rajendra");
		
	//	System.out.print(spilttedString[0]);
		//System.out.println(spilttedString[1]);
	//	System.out.println(spilttedString[2]);
	//	System.out.println(spilttedString[1].trim());
		
		// **************************************************************
		
		for(int i=0; i<s7.length();i++)
		{
			System.out.println(s7.charAt(i));
		}
		
		
		System.out.println("\n");
		
		//Reverse String 
		
		for(int i=s7.length()-1; i>=0;i--)
		{
			System.out.println(s7.charAt(i));
		}
		
	}

}
