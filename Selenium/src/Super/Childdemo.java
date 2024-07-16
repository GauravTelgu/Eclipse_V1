package Super;

public class Childdemo extends parentdemo {

	//The super keyword in Java is a reference variable that is used to refer to parent class when we're working with objects.
	
	String name = "Selenium";			// Preference is given to local variable(child class)
	
	public Childdemo() 
	{
		//super();
		System.out.println("Child class constructor");
	}
	
	public void getStringdata()
	{
		System.out.println(name);
		System.out.println(super.name);
	}
	
	public void getdata() 
	{
		super.getdata();
		System.out.println("Child class");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Childdemo cd = new Childdemo();
		cd.getStringdata();
		cd.getdata();
	}

}
