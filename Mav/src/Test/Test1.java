package Test;

public class Test1 {
	
	public void nonStaticTest() {
		System.out.println("Non Static Test");
	}
	
	static void StaticTest() {
		System.out.println("Static Test");
	}

	public static void main(String[] args) {
		Test1 Testobject = new Test1();
		Testobject.nonStaticTest();
		//System.out.println("MAVERIC");
		
		Test1 Testobject1 = new Test1();
		Testobject1.StaticTest();
		
		
	}

}
