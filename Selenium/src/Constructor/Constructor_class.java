package Constructor;

public class Constructor_class {

	public Constructor_class()
	{
		System.out.println("Return the Constructor");	
	}
	
	public void getdata() 
	{
	System.out.println("Return the getdata method");	
	}
	
	
	//Parameterized Constructor
	//constructor will call implicit constructor if you have not defined constructor
	
	public Constructor_class(int a, int b)
	{
		System.out.println("Return the Parameterized Constructor");	
		int c=a+b;
		System.out.println(c);
	}
	
	public Constructor_class(String str)
	{
		System.out.println(str);	
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Constructor_class c = new Constructor_class(4,5);
		Constructor_class cd = new Constructor_class();
		Constructor_class cds = new Constructor_class("Hello");
		cd.getdata();
		//Constructor executes a block of code whenever an object is created.
		//Whenever an object is created constructor is invoked automatically.
		//Constructor is same as a method but the only difference between them is constructor will not return values and name 
		//of constructor should always be same as class name.
		
		
		
	}

}
