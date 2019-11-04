package com.list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Loop {
	
	public static void main(String[] args) {
		
		
		List<String> ls = new ArrayList<String>(Arrays.asList("Guarav","singh","chandel", "Harsh","Vardhan", "singh"));
		
		ArrayList l = new ArrayList<String>();
		
		for (String string : ls) {
			System.out.println(string);
		}
	}

}
