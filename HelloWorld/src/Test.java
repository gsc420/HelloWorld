import java.lang.reflect.Array;
import java.util.Arrays;

public class Test {

	public static void main(String[] args) {

		String[] aArray = new String[5];
		String[] bArray = { "a", "b", "c", "d", "e" };
		String[] cArray = new String[] { "a", "x", "c", "d", "e" };
		aArray[0]="gaurav";
		aArray[1]="saurabh";
		
		String ary = Arrays.toString(aArray);
		Arrays.sort(cArray);
		System.out.println("Completely sorted order =>\n" + Arrays.toString(cArray));
		System.out.println(aArray[0] + "  " +aArray[1]);
		//System.out.println("Completely sorted order =>\n" + Arrays.toString(aArray));
		System.out.println(ary);
		//System.out.println( Arrays.toString(bArray));

	}

}
