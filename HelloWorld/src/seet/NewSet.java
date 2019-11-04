package seet;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class NewSet {

	public static void main(String[] args) {
		
		
		String msg ="I Love India";
		
		char[] arr = msg.toCharArray();
		
		for (Character char1 : arr) {
			System.out.println(char1);
		}

/*		System.out.println("HashSet Start");
		
		StringBuilder sb1 = new StringBuilder("23");
		StringBuilder sb2 = new StringBuilder("234");
		StringBuilder sb3 = new StringBuilder("23");
		
		
		Set<StringBuilder> values = new HashSet<>(Arrays.asList(sb1,sb3,sb2));

		//System.out.println(values.iterator());
		for (StringBuilder x : values) {

			System.out.println(x);
		}
		
		
		  System.out.println("HashSet End---------------------");

		Set<Integer> value = new HashSet<>(Arrays.asList(48, 89, 645, 85, 614, 78, 6546, 5645, 56, 5664, 564));
		for (Integer a : value) {
			System.out.println(a);

		}*/
		System.out.println("TreeSet Start");
		Set<String> value2 = new TreeSet<>(Arrays.asList("raju", "raju1", "raju2", "raju3", "raju4", "raju5","raju5"));
		value2.remove("raju5");

		//System.out.println(values.iterator());
		for (String x : value2) {

			System.out.println(x);
		}
		System.out.println("TreeSet End-------------------------");
		
	}

}
