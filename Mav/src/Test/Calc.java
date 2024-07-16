package Test;

public class Calc {

	public int add (int a, int b) {
		int i = a+b;
		return i;
	}
	
	public static void main (String args[]) {
		Calc cal = new Calc();
		int result = cal.add(10,20);
		System.out.print("result of addition is" +result);
	}
}
