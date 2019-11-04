package com.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import com.list.pojo.Employee;

public class MainTest1 {

	public static void main(String[] args) {

		List<Integer> intList = new ArrayList();

		List<Employee> list = new ArrayList<Employee>();

		list.add(new Employee(4, 12, 213313, "kolkata"));

		list.add(new Employee(1, 14, 123132, "ncr"));

		list.add(new Employee(3, 11, 1231, "patna"));

		list.add(new Employee(2, 14, 556, "kochi"));

		Collections.sort(list);

		list.forEach(emp -> System.out.println(emp.getEmpId() + "," + emp.getCity()));
	}

}
