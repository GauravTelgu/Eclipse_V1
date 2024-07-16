package Collections;

import java.util.HashSet;
import java.util.Iterator;

public class hashsetexample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Hashset, Treeset, LinkedHashSet implements Set interface
		//Does not accept duplicate values
		//There is no guarantee that elements are stored in sequential order....Random Order
		
		HashSet<String> hs = new HashSet<String>();
		hs.add("USA");
		hs.add("UK");
		hs.add("India");
		
		hs.add("Gaurav");
		hs.add("Telgu");
		
		
		hs.add("India");
		System.out.println(hs);
		//System.out.println(hs.remove("UK"));
		System.out.println(hs.isEmpty());
		System.out.println(hs.size());
		
		//Iterator
		
		Iterator<String> i = hs.iterator();
		while(i.hasNext())
		{
		System.out.println(i.next());			//0th Index
		//System.out.println(i.next());		
		}
		
	}

}
