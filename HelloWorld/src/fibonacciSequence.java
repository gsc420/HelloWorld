
public class fibonacciSequence {

	public static void main(String[] args) {
		int previousnum = 0;
		int nextnum = 1;
		for (int i = 0; i < 30; i++) {

			System.out.println(previousnum);
			int sum = previousnum + nextnum;
			previousnum = nextnum;
			nextnum = sum;
		}

	}

}
