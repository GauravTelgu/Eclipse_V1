package Inheritance;

public class Methodoverloading {

	public void getdata(int a) {
		System.out.println(a);
	}
	
	public void getdata(int a, int b) {
		System.out.println(a+" "+b);
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Methodoverloading m = new Methodoverloading();
		m.getdata(10);
		m.getdata(20,30);
	}

}
