package Methods;
import java.util.ArrayList;
import java.util.List;

public class Methodsdemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Methodsdemo d = new Methodsdemo();
		d.getdata();
		//ArrayList<String> Array = d.getdata();
		Methodsdemo2 d1 = new Methodsdemo2();
		String a = d1.getuserdata();
		d.getdata2();
		
			
//for (int i=0; i<Array.size();i++) {
//			
//			System.out.println(Array);
//			System.out.println(a);
//			//System.out.println(letters);
//			break;
//		}
		//for(String s:Array) {
		//System.out.println(s);
		//}
			//	System.out.println(name.get(0));
				}

	public void getdata()
	{
		
		
		
		System.out.println("Java1 Selenium");
		//return "Gaurav Telgu"; {"Gaurav","Telgu"}
		ArrayList<String> Array = new ArrayList<String>();
		Array.add("Gaurav");
		Array.add("Telgu");
		Array.add("Selenium");
		//return Array;
		
		for (int i=0; i<Array.size();i++) {
			
			System.out.println(Array);
			//System.out.println(a);
			//System.out.println(letters);
			break;
		}
		
	}
	
	
	
	public static void getdata2()
	{
		System.out.println("Selenium11");
		//return "Gaurav Telgu"; {"Gaurav","Telgu"}
		return;
		
	}
	
}