package com.list;

import java.util.LinkedList;
import java.util.ListIterator;

public class ListIteratorDemo {
	public static void main(String arg[]) {
		LinkedList l = new LinkedList();
		l.add("balakrishna");
		l.add("chiru");
		l.add("venky");
		l.add("nag");
		System.out.println(l);
		ListIterator ltr = l.listIterator();
		while (ltr.hasNext()) {
			String s = (String) ltr.next();
			if (s.equals("chiru")) {
				ltr.add("GauravSinghChandel");
			}
		}
		System.out.println(l);
	}
}