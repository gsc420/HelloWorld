import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

class DuplicateCountofNumberArraylist {
	
	
	public static void countFrequencies(ArrayList<Integer> list) {

		// hash set is created and elements of
		// arraylist are insertd into it
		Set<Integer> st = new HashSet<Integer>(list);
		for (Integer s : st)
			System.out.println(s + ": " + Collections.frequency(list, s));
	}

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<Integer>(Arrays.asList(2132, 3434, 34, 343, 5, 5, 6, 8, 9, 5, 324, 32, 6,
				634, 6, 78, 65, 6, 634, 6, 78, 65, 2132, 3434, 34, 343, 5, 5, 6, 8, 9, 5));

		Set<Integer> st = new HashSet<Integer>(list);
		for (Integer s : st)
			System.out.println(s + ": " + Collections.frequency(list, s));

	}
}