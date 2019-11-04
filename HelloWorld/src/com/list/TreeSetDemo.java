package com.list;

import java.util.TreeSet;

public class TreeSetDemo {
	public static void main(String arg[])
	{
	TreeSet t = new TreeSet();
	t.add("A");
	t.add("B");
	t.add("Z");
	t.add("L");
	//t.add(new Integer(10));
	System.out.println(t.add("A"));
	System.out.println(t);
	}
}
