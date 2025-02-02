package Collections;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class hashtable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

// Hashmap is non-synchronized and not thread safe i.e. better for non threading applications
// whereas Hashtable is synchronized and thread safe used in multi-threading applications
		 
//Hashmap allows one null key and any no. of null values
//Hashtable do not allow null keys and values in the HashTable object.
		
//Hashmap object values are iterated by using Iterator
//Hashtable is the only class other than vector which uses enumerator to iterate the values of HashTable object.
		
				Hashtable<Integer, String> hm = new Hashtable<Integer, String>();
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


