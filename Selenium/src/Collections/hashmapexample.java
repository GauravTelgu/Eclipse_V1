package Collections;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;

public class hashmapexample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HashMap<Integer, String> hm = new HashMap<Integer, String>();
		hm.put(0, "Gaurav");
		hm.put(1, "Telgu");
		hm.put(2, "Java");
		hm.put(3, "Selenium");
		System.out.println(hm.get(2));
		hm.remove(2);
		System.out.println(hm.get(2));
		
		// the entrySet() method returns a set view of all the entries from the hashmap. 
		//The entrySet() method can be used with the for-each loop to iterate through each entry of the hashmap.
		Set sn = hm.entrySet();
		Iterator i = sn.iterator();
		
		//Create Hashtable and pass the table to set collection and print the value separately.
		
		while(i.hasNext())
		{
	//	System.out.println(i.next());
		Map.Entry mp = (Map.Entry)i.next();
		System.out.println(mp.getKey());
		System.out.println(mp.getValue());
		}
		}

}
