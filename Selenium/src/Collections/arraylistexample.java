package Collections;

import java.util.ArrayList;

public class arraylistexample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//ArrayList comes under Util Package
		//Can accept duplicate values, ArrayList, LinkedList and Vector all can accept duplicate values.
		
		//array have fixed size whereas ArrayList grows dynamically.
		//You can access and insert any values in any index in Arraylist.
		
		ArrayList<String> a = new  ArrayList<String>();
		a.add("Gaurav");
		a.add("Telgu");
		a.add("Telgu");
		System.out.println(a);
		a.add(0, "GT");
		System.out.println(a);
		/*a.remove(1);
		System.out.println(a);*/
		System.out.println(a.get(2));
		System.out.println(a.contains("Gaurav"));
		System.out.println(a.indexOf("Telgu"));
		System.out.println(a.isEmpty());
		System.out.println(a.size());
		
	}

}
