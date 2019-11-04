import java.util.Arrays;

public class My {

	public static void main(String[] args) {
		{
			int ar[] = { 4, 6, 1, 8, 3, 9, 7, 4, 2 };

			
			System.out.println("Sorted array in range" + " of 0-4 =>\n" + Arrays.toString(ar));
			Arrays.sort(ar, 0, 4);
			
			
			System.out.println("Sorted array in range" + " of 0-4 =>\n" + Arrays.toString(ar));
			// To print the elements in one line
			Arrays.sort(ar);
			System.out.println("Completely sorted order =>\n" + Arrays.toString(ar));
		}
	}

}
