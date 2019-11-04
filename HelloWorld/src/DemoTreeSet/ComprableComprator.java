package DemoTreeSet;

import java.util.Set;
import java.util.TreeSet;

public class ComprableComprator {

	public static void main(String[] args) {
		
		Employee e1 = new Employee("Gaurav", 1001);
		Employee e2 = new Employee("Sona", 1004);
		Employee e3 = new Employee("Ronav", 100);
		Employee e4 = new Employee("Tony", 106);
		Employee e5 = new Employee("Ritu", 11);
		Employee e6 = new Employee("Voshal", 1001);
		Employee e7 = new Employee("Kullu", 1001);
		Set t = new TreeSet<>();
		t.add(e1);
		t.add(e2);
		t.add(e3);
		t.add(e4);
		t.add(e5);
		t.add(e6);
		t.add(e7);
		for (Object obj : t) {
			System.out.println(obj);
		}

	}

}
