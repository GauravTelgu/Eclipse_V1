public class String_19 {

	public void String1() {
		String name1 = "Sachin Tendulkar";
		String name2 = "Rahul Dravid";
		
		String Firstname = name1.split(" ")[0];
		String Lastname = name2.split(" ")[1];
		
		System.out.println("First name from 'Sachin Tendulkar:" + " " + Firstname);
		System.out.println("Second name from 'Rahul Dravid': " + Lastname);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String_19 obj1 = new String_19();
		obj1.String1();
		
	}

}
