package Packages;

import Methods.Methodsdemo;		// User defined package

public class demopack {

	public void abc() {
		System.out.println("Hello");
	}
	
	public void xyz() {
		System.out.println("world");
	}
	
	
	// Access modifiers
	//Public, Private, Protected and default
	
//Default - Can access method anywhere in package only.
	
	void ab() {
			System.out.println("ab");
		}
	
//Public - Variables/Methods as public then you will have access across all the packages. 
	
	public void cd() {
		System.out.println("cd");
	}
	
//Private - Variables/Methods declared as private cannot be accessed outside the class, Cannot access it even in same package. 
	
	private void ef() {
		System.out.println("ef");
	}
	
//Protected - Variables/Methods declared as protected can be accessed in for all classes in same package, plus for other packages only 
// subclass which inherits the properties of parent class can be accessed. (Protected = Default + 1 Extra feature)
	
		protected void gh() {
			System.out.println("gh");
		}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Methodsdemo M1= new Methodsdemo();
		demopack dp= new demopack();
		dp.abc();
		dp.xyz();
		dp.ef();
		M1.getdata();
		
	}

}
