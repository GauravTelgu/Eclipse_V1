package Exceptionhandling;

public class exceptiondemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a =5;
		int b=0;
//One try can be followed by multiple catch blocks
//catch should be followed by try block immediately.
//Finally block will not get executed only when you stop the JVM forcefully/stop the program execution forcefully before the output.
		
		try 
		{
			//int c = a/b;
			int x[]= new int[5];
		System.out.println(x[7]);	
		
		}
		
		//ArithmeticException
		catch(ArithmeticException et)
		{
			System.out.println("ArithmeticException caught");
		}
		
		//IndexOutOfBoundsException
		
		catch(IndexOutOfBoundsException ets)
		{
			System.out.println("I catched the IndexBound/Exception");
		}
		
		//Exception is general exception which catches all sort of exception
		catch(Exception e)
		{
			System.out.println("Exception caught");
		}
		
		finally
		{
			System.out.println("Delete cookies");
			//This block of code is executed irrespective of exception thrown or not and executes all code present in this block
		}
		}
	}


