package loops;

public class Loops {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int x =15;
		int y= 18;
		
		
		
//1	- if	 
		if(15>12) 
	{
		 System.out.println("The value of x is greater than y");
		 }
	
	
	
//2 - if else 	
		if(x>y) 
		{
			 System.out.println("The value of x is greater than y");
			 }
			 else {
				 System.out.println("The value of y is greater than x");
			 }
		
//3 - if else if else
		int time = 22;
		if(time < 10)
		{
			 System.out.println("Good morning");
		}
		else if (time < 18)
		{
			System.out.println("Good afternoon");
		}
		else
		{
			System.out.println("Good evening");
		}
			 

// 4 - Switch statement
		int day = 8;
	switch (day) {
	  case 1:
	    System.out.println("Monday");
	    break;
	  case 2:
	    System.out.println("Tuesday");
	    break;
	  case 3:
	    System.out.println("Wednesday");
	    break;
	  case 4:
	    System.out.println("Thursday");
	    break;
	  case 5:
	    System.out.println("Friday");
	    break;
	  case 6:
	    System.out.println("Saturday");
	    break;
	  case 7:
	    System.out.println("Sunday");
	    break;
	  default:
		System.out.println("Looking forward to the Weekend");
		}
   }
}


