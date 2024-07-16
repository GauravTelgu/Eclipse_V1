import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Currentdate_String_14 {

	public void CS() {
		
		LocalDate CurrentLocalDate = LocalDate.now();
		 System.out.println("Current Date: " + CurrentLocalDate);
		
		 String datestring = CurrentLocalDate.format(DateTimeFormatter.ofPattern("yyyy-mm-dd"));
		 System.out.println("Current Date as String: " + " " + datestring);
		
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Currentdate_String_14 obj1 = new Currentdate_String_14();
		obj1.CS();
	}

}
