
public class DiffenceDiagonal {

	public static void main(String[] args) {
		
		int [][] mat = {{5,8,9,8},{7,99,4,9},{78,96,64,89},{7,3,24,77}};
		int [][] mat4 = {{5,8,9,8,9},{7,99,4,9,9},{78,96,64,89,9},{7,3,24,77,9},{88,3,254,757,59}};
		int [][] mat2 = {{5,8,9},{7,99,4},{78,96,64}};
		int [][] mat3 = {{5,8},{7,99}};
		int dimenstion=4;
		subtractionOfDiganal(mat, dimenstion);
		System.out.println();
		subtractionOfDiganal(mat2, 3);
		System.out.println();
		subtractionOfDiganal(mat3, 2);
		System.out.println();
		subtractionOfDiganal(mat4, 5);
		
		
		

	}
	
	public static void subtractionOfDiganal(int [][] matrix, int size ){
		int firstDignal=0;
		int secondDignal=0;
		
		for (int i = 0; i < size; i++) {
			
			
			for (int j = 0; j < size; j++) {
				
				if (i==j){
					firstDignal +=matrix[i][j];
				}
				 if ((i+j)==size-1){
					secondDignal+=matrix[i][j];
				}
					
			}
			
		}
		System.out.println(firstDignal);
		System.out.println(secondDignal);
		System.out.println(firstDignal-secondDignal);
		
	}

}
