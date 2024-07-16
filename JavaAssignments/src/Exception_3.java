
public class Exception_3 {

	public void Excp() {
		
		try {
			int age = 0;
			if (age < 25 || age > 55) {
				System.out.println("Print age:");
			}
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("Exception if age is below 25 or above 55:");
		}
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Exception_3 obj = new Exception_3();
		obj.Excp();
	}

}
