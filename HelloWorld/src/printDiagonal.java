
public class printDiagonal {

	static void printDiagonalSums(int[][] mat, int n) {
		
		int principal = 0, secondary = 0;
		
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {

				// Condition for principal
				// diagonal
				if (i == j)
					principal =principal+ mat[i][j];

				// Condition for secondary
				// diagonal
				else if ((i + j) == (n - 1))
					secondary += mat[i][j];
			}
		}

		System.out.println("Principal Diagonal:" + principal);

		System.out.println("Secondary Diagonal:" + secondary);
	}

	// Driver code
	static public void main(String[] args) {

		//int[][] a = { { 1, 2, 3, 4 }, { 5, 6, 7, 8 }, { 1, 2, 3, 4 }, { 5, 6, 7, 8 } };
		int[][] a= { 
	            {11, 2, 4}, 
	            {4 , 5, 6}, 
	            {10, 8, -12} 
	        };

		printDiagonalSums(a, 3);
	}

}

/*A00 A01 A02 A03
  A10 A11 A12 A13
  A20 A21 A22 A23
  A30 A31 A32 A33*/