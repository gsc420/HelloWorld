
public class print2D {

	public static void print2D(int mat[][]) {
		// Loop through all rows
		for (int[] row : mat)

			// Loop through all columns of current row
			for (int x : row)
				System.out.print(x + " ");
	}

	public static void main(String[] args) {

		int z[][] = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
		print2D(z);
	}

}
