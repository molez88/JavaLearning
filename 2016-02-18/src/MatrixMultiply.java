import java.util.Scanner;

public class MatrixMultiply {

	public static void main(String[] args) {
		
		Scanner m1row = new Scanner(System.in);
		System.out.print("How many rows are in the first matrix?     ");
		int a = m1row.nextInt();
		
		Scanner m1column = new Scanner(System.in);
		System.out.print("How many columns are in the first matrix?     ");
		int b = m1column.nextInt();
		
		Scanner m2row = new Scanner(System.in);
		System.out.print("How many rows are in the second matrix?     ");
		int c = m1row.nextInt();
		
		Scanner m2column = new Scanner(System.in);
		System.out.print("How many columns are in the second matrix?     ");
		int d = m1column.nextInt();
		
		System.out.println();
		
		
		if (a <= 0 | b <= 0 | c <= 0 | d <= 0){
			System.out.print("The number of rows and the number of columns must be positive integers.");
			System.exit(-1);
		}
		
		if (b != c){
			System.out.println("The number of columns in the first matrix must be equal to ");
			System.out.println("the number of rows in the second matrix for matrix multiplication to work");
			System.exit(-1);
		}
		
		
		
		System.out.println();
		
		//declare matrices and then input values for them
		int[][] matrix1 = new int [a][b];
		int[][] matrix2 = new int [c][d];
				
		System.out.println("Values for the first matrix:");
		
		for (int x = 0; x < a; x++){
			System.out.println("Values of row " + x);
			for (int y = 0; y < b; y++){
				Scanner numbers = new Scanner(System.in);
				System.out.print("Value of matrix1[" + x + "][" + y + "] is: ");
				int value = numbers.nextInt();
				matrix1[x][y] = value;
			}
		}
				
		System.out.println();
		System.out.println();
		System.out.println("Values for the second matrix:");
				
		for (int x = 0; x < c; x++){
			System.out.println("Values of row " + x);
			for (int y = 0; y < d; y++){
				Scanner numbers = new Scanner(System.in);
				System.out.print("Value of matrix2[" + x + "][" + y + "] is: ");
				int value = numbers.nextInt();
				matrix2[x][y] = value;
			}
		}
		
		System.out.println();
		System.out.println();
		System.out.println("Matrix1 * Matrix2:");
		
		//now do multiplication
		int parvalue = 0;
		int sum = 0;
		
		for (int x = 0; x < a; x++){
			for (int y = 0; y < b; y++){
				for (int n = 0; n < d; n++){
					parvalue = matrix1[x][y] * matrix2[y][n];
					sum = sum + parvalue;
				}
				System.out.printf("%5d " , sum);
			}
			System.out.println();
			
		}
		
		

	}

}
