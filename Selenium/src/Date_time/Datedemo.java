package Date_time;

import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class Datedemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Date d = new Date();
		
		SimpleDateFormat sdf = new SimpleDateFormat("M/d/yyyy");
		SimpleDateFormat sd = new SimpleDateFormat("yyyy/d/M HH:mm:ss");
		System.out.println(sdf.format(d));
		System.out.println(d.toString());
		System.out.println(sd.format(d));
		
		//DateTimeFormatter myFormatObj = 
	//	String formattedDate = d.format(DateTimeFormatter.ofPattern("dd-MM-yyyy"));
		//System.out.println("After formatting: " + sdf);
	
		
	}

}
