package com.list;

import java.util.ArrayList;
import java.util.Iterator;

class IteratorDemo {
	public static void main(String arg[]) {
		ArrayList<Integer> al = new ArrayList<Integer>();
		for (int i = 0; i <= 10; i++) {
			al.add(i);
		}
		System.out.println(al);
		Iterator<Integer> itr = al.iterator();
		while (itr.hasNext()) {
			Integer i = itr.next();
			if (i % 2 == 0) {
				System.out.println(i);
			} else {
				itr.remove();
			}
		}
		System.out.println(al);
	}
}