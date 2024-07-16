package Variables;

public class StaticVar {

	String name;		// instance variable
	String address;		// instance variable
	static String city = "Pune";  //class variable --> All static variables are class variables
	static int i=0;
	//Pros of using static is objects can use the same variable value instead of creating.
	//static variables are shared by multiple objects to save space (avoids memory creation)
	
	
	//Static block Is used to initialize static variables instead of declaring it static everytime
	
	static {
		city = "delhi"; 
		i=0;
	}
	
	StaticVar(String name,String address)		//Local variable --> Comes inside constructor
	{
		this.name=name;
		this.address=address;
		i++;
		System.out.println(i);
		
		//System.out.println(address);
	}
	
	public void getaddress() 
	{
		
		System.out.println(address+" "+ city);
	}
	
	public static void getcity() 
	{
		//Only static variables can be used inside static method
		System.out.println(city); // --> //City is a static method
	}
	
	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StaticVar obj =new StaticVar("Gaurav","Wanowrie");
		StaticVar obj1 =new StaticVar("Sunny","Fatima Nagar");
		obj.getaddress();
		obj1.getaddress();
		
		//Static method will accept only static variables.
		//Static method are independent of objects --> called as class methods
		StaticVar.getcity();  //--> classname.methodname
		StaticVar.i=4;
		
	}

}
