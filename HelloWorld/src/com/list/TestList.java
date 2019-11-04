package com.list;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.Vector;

public class TestList {

	public static void main(String[] args) {
		ArrayList a = new ArrayList();
		a.add("A");
		a.add(new Integer(10));
		a.add("A");
		a.add(null);
		a.add(null);
		a.add(null);
		System.out.println(a);
		a.remove(2);
		System.out.println(a);
		a.add(2, "M");
		a.add("N");
		System.out.println(a);
	}

}
