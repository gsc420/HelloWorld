import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Var {

	public static void main(String[] args) {

		List<Integer> z = new ArrayList<>(Arrays.asList(5, 9, 11));
		List<Integer> p = new ArrayList<>(Arrays.asList(3,6 ,10));
		List<Integer> q= compareTriplets(z, p);
		System.out.println(q);
		

	}
	
	static List<Integer> compareTriplets(List<Integer> a, List<Integer> b) {
    	
		Integer[] intArray = new Integer[2];
    	int alicePoints = 0;
    	int bobPoints = 0;
    	for (int i = 0; i < 3; i++) {
    		if(a.get(i)>b.get(i)){
    			alicePoints++;
        	}
        	else if(a.get(i)<b.get(i)){
        		bobPoints++;
        	}
		}
    	intArray[0] = alicePoints;
    	intArray[1] = bobPoints;
    	List<Integer> x = new ArrayList<Integer>(Arrays.asList(intArray));
    	return x;

}}
