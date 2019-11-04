package com.list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MainClass {

	public static void main(String[] args) {
		
		List<Integer> lt =new ArrayList<Integer>(Arrays.asList(1,2,3,4,5,6));
		List<Integer> list = new ArrayList<Integer>(Arrays.asList(5,5,7,6,8,10));
		List<Integer> list2 = new ArrayList<Integer>();
		//System.out.println(lt.addAll(list));
		//System.out.println(lt);
		/*
		System.out.println(lt.retainAll(list));
		System.out.println(lt);
		System.out.println(list);*/
		
		
		//System.out.println(lt.contains(8));
		//System.out.println(lt.containsAll(lt));
		lt.removeAll(list);
		System.out.println(lt);
		
//		lt.forEach(games -> System.out.println(games));  
		
		
/*		for (Integer p : lt) {
			System.out.println(p);
		}*/
		
	
		
	}
}
