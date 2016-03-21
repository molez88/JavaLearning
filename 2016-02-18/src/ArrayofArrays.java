
public class ArrayofArrays {

	public static void main(String[] args) {
		
		//matrix is an array of arrays
		
		//declare a matrix of 2 rows and 3 columns
		
		int[][] matrix = new int [2][3];
		
		matrix[0][0] = 1;
		matrix[0][1] = 5;
		matrix[0][2] = 6;
		matrix[1][0] = 3;
		matrix[1][1] = 10;
		matrix[1][2] = 11;
		
		for (int r = 0; r < 2; r++){
			for (int c = 0; c < 3; c++){
				int value = matrix[r][c];
				System.out.printf("%5d " , value);
			}
			System.out.println();
		}
		
		
		
	}

}
