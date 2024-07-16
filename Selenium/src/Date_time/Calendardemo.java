package Date_time;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Calendardemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Calendar cal = Calendar.getInstance();
		SimpleDateFormat sd = new SimpleDateFormat("yyyy/d/M");
		System.out.println(sd.format(cal.getTime()));
		
	}

}
