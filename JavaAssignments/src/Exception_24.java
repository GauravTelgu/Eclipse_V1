

public class Exception_24 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
			int numerator = 25;
			int denominator = 0;
			int result =numerator/denominator;
			System.out.println("Result :" + " " + result);
			
		} catch (ArithmeticException e) {
			// TODO: handle exception
			System.out.println("Caught an ArithmeticException: " + e.getMessage());
		}
		catch (Exception e) {
			// TODO: handle exception
			System.out.println("Caught an exception: " + e.getMessage());
		}
		finally{
			System.out.println("This is the finally block. It always executes.");
	}
		 System.out.println("Program continues after the try-catch-finally block.");
}
}
