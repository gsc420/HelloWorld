package maps;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class Maps {

	public static void main(String[] args) {

		Map<Integer, String> m = new TreeMap<Integer, String>();

		m.put(12, "gaurav1");
		m.put(10, "gaurav2");
		m.put(22, "gaurav3");
		m.put(398, "aryan");
		m.put(400, "chandel");
		m.put(5, "shweta");
		System.out.println(m.entrySet());
		
	/*	System.out.println(m.containsValue("test"));
		System.out.println(m.equals("gaurav1"));*/

		
	
		
		for(Map.Entry<Integer, String> entry: m.entrySet())
		    System.out.println( entry.getValue());
		System.out.println("");
		m.forEach((k,v) -> System.out.println(v));
	}

}
