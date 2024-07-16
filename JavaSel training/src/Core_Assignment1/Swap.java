package Core_Assignment1;

public class Swap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a = 5;
		int b = 10;
		
		System.out.println("Before Swap : a = " +  a + ", b  =" + b);
		
		a = a + b;   //--> (5+10 = 15)
		b = a - b;	 //--> (15-10 = 5)
		a = a - b;   //--> (15-5 = 10)
		
		System.out.println("After Swap : a = " + a + ",b = " + b);
	}

}
