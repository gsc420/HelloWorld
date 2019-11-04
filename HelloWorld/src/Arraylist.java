import java.util.ArrayList;
import java.util.Arrays;

public class Arraylist {

	public static void main(String[] args) {
		// Create ArrayList from array
		
		String[] stringArray = { "a", "b", "c", "d", "e" };
		ArrayList<String> arrayList = new ArrayList<String>(Arrays.asList(stringArray));
		System.out.println(arrayList);
		// [a, b, c, d, e]

	}

}
