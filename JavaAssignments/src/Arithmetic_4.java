
public class Arithmetic_4 {

	
	public void calculate (int a, int b, String operation) {
		switch (operation) {
		case "add":
			System.out.println("Addition of two nos : " + (a+b));
		case "sub":
			System.out.println("Subtraction of two nos : " + (a-b));
		case "mul":
			System.out.println("Multiplication of two nos : " + (a*b));
		case "div":
			if(b!=0) {
			System.out.println("Division of two nos : " + (a/b));
		
		}else {
           // return "Division by zero is not allowed";
            System.out.println("Division by zero is not allowed");
        }
		
		 default: //return "Invalid operation";
		 System.out.println("Invalid operation");
		
		 
		
	}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Arithmetic_4 am = new Arithmetic_4();
		am.calculate(10, 5, "add");
		/*
		 * System.out.println(calculate(10, 5, "add")); System.out.println(calculate(10,
		 * 5, "sub")); System.out.println(calculate(10, 5, "mul"));
		 * System.out.println(calculate(10, 5, "Div"));
		 */
	}

}
