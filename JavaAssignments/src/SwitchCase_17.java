import java.time.LocalDate;
import java.time.Month;

public class SwitchCase_17{

	
	public void Switch1() {
	// Get the current date
	LocalDate CurrentDate = LocalDate.now();
	
	// Extract the current month
	Month Currentmonth = CurrentDate.getMonth();	
	
	switch (Currentmonth) {
    case JANUARY:
        System.out.println("Current month is Jan.");
        break;
    case FEBRUARY:
        System.out.println("Current month is Feb.");
        break;
    case MARCH:
        System.out.println("Current month is Mar.");
        break;
    case APRIL:
        System.out.println("Current month is Apr.");
        break;
    case MAY:
        System.out.println("Current month is May.");
        break;
    case JUNE:
        System.out.println("Current month is June.");
        break;
    case JULY:
        System.out.println("Current month is July.");
        break;
    case AUGUST:
        System.out.println("Current month is August.");
        break;
    case SEPTEMBER:
        System.out.println("Current month is September.");
        break;
    case OCTOBER:
        System.out.println("Current month is October.");
        break;
    case NOVEMBER:
        System.out.println("Current month is November.");
        break;
    case DECEMBER:
        System.out.println("Current month is December.");
        break;
    default:
        System.out.println("Invalid month!");
        break;
	
				
	}	
}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SwitchCase_17 Obj1 = new SwitchCase_17();
		Obj1.Switch1();
	}
}



