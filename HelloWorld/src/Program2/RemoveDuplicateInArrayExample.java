package Program2;

import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicateInArrayExample {

	public static void main(String[] args) {

		Integer[] x = { 44, 45, 5, 6546, 3252, 657, 45, 435, 436, 6546, 3252, 657, 45 };

		System.out.println("With duplicate number" + " " + Arrays.toString(x));
		Set<Integer> withoutDuplicate=new HashSet<>(Arrays.asList(x));
		System.out.println(withoutDuplicate);
		
		for (Integer integer : withoutDuplicate) {
			System.out.println(integer);
		}
		

	}
}