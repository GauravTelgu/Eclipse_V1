

public class String_Replace_22 {

	String Original1 = "Liverpool";
	String Original2 = "City";
	
	public void String1()
	{
		String Updated1 = Original1.replace("Liverpool","Liverpool Football Club");
		String Updated2 = Original2.replace("City", "Manchester City");
		
		System.out.println("Original1:" + " " + Original1);
		System.out.println("Updated1:" + " " + Updated1);
		System.out.println("Original2:" + " " + Original2);
		System.out.println("Updated2:" + " " + Updated2);
	}	 
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
		String_Replace_22 obj1 = new String_Replace_22();
		obj1.String1();
	}

}
