import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ShortArraylistDemo {

	public static void main(String[] args) {
		
		List<Integer> al = new ArrayList<Integer>(Arrays.asList(2132,3434,34,343,5,5,6,8,9,5,324,32,6,634,6,78,65,6,634,6,78,65,2132,3434,34,343,5,5,6,8,9,5));
		Set<Integer> st = new HashSet<Integer>(al);

		for (Integer inte : st) {
			System.out.println(inte + "= " + Collections.frequency(al, inte)); 
		}
		
	}
}
