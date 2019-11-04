package com.list;

import java.util.*;

public class LearningCollection {

	public static void main(String[] args) {

		List<String> lis = new ArrayList<String>(Arrays.asList("gaurav", "singh", "test"));
		List<String> lis2 = new ArrayList<String>(Arrays.asList("gaurav", "singh", "chandel"));
		lis.add(1, "raji");

	//System.out.println(lis);
	/*	System.out.println(lis.get(2));
		System.out.println(lis.remove(2));
		System.out.println(lis.add("chandel"));
		System.out.println(lis.isEmpty());*/
		
		
		//System.out.println(lis.addAll(lis2));
		System.out.println(lis);
		
		
	//	System.out.println(lis.removeAll(lis2));
	//	System.out.println(lis);
		
		/*lis.retainAll(lis2);
		System.out.println(lis);
		*/
		

	}

}
