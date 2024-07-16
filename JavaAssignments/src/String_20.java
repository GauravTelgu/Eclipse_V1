

public class String_20 {

	
	public void String() {
		String OriginalName = "Davi Beckham";
		String Originalgoals = "Lionel Messi has scored 400 goals";
		
		String UpdatedName = OriginalName.replace("Davi", "David");
		String Updatedgoals = Originalgoals.replace("400","579");
		
		System.out.println("Original Name:" + OriginalName);
		System.out.println("Updated Name:" + UpdatedName);
		System.out.println("Original Goals:" + Originalgoals);
		System.out.println("Updated Goals:" + Updatedgoals);
		
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String_20 obj1 = new String_20();
		obj1.String();
		
	}

}
