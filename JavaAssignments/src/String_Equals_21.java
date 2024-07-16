

public class String_Equals_21 {  

	//Comparison
	public void String() {
		
		String name1 = "Cristiano Ronaldo";  
		String name2 = "Ronaldo Nazario";
		
		boolean check = name1.equals(name2);
		
		if (check) {
			System.out.println("Names are Equal");
		}
		else {
			System.out.println("Names are not Equal");
		}
		}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String_Equals_21 obj1 = new String_Equals_21();
		obj1.String();
	}

}
