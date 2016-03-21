import java.util.Scanner;

public class MatrixAddSub {
	
	public static int[][] Add(int[][] matr1, int[][] matr2){
		int r1 = matr1[0].length;
		int c1 = matr1.length;
		int r2 = matr2[0].length;
		int c2 = matr2.length;
		
		if (r1 != r2 | c1 != c2){
			System.out.println("Cannot add two matrices with different dimensions.");
			System.exit(-1);
		}
		
		int[][] result = new int[r1][c1];
		
		for (int x = 0; x < r1; x++){
			for (int y = 0; y < c1; y++){
				result[x][y] = matr1[x][y] + matr2[x][y];
			}
			//System.out.println();
		}
		return result;
	}
	
	
	public static int[][] Sub(int[][] matr1, int[][] matr2){
		int r1 = matr1[0].length;
		int c1 = matr1.length;
		int r2 = matr2[0].length;
		int c2 = matr2.length;
		
		if (r1 != r2 | c1 != c2){
			System.out.println("Cannot subtract two matrices with different dimensions.");
			System.exit(-1);
		}
		
		int[][] result = new int[r1][c1];
		
		for (int x = 0; x < r1; x++){
			for (int y = 0; y < c1; y++){
				result[x][y] = matr1[x][y] - matr2[x][y];
			}
			//System.out.println();
		}
		return result;
	}

	public static void main(String[] args) {
		//matrix1 and matrix2 of row length r and column length c
		//Use println "Insert values for matrix1" and then nested for loop with 
		//Scanner.input to receive values for matrices
		//Then add or subtract matrices.
		
		//get number of rows and columns for the matrices
		
		System.out.println("You can only add/subtract two matrices if they have the same dimensions");
		
		Scanner row = new Scanner(System.in);
		System.out.print("How many rows are in the matrix?     ");
		int r = row.nextInt();
		
		
		Scanner column = new Scanner(System.in);
		System.out.print("How many columns are in the matrix?     ");
		int c = column.nextInt();
		
		System.out.println();
		
		//catch error: cannot have row or column values <=0
		if (r <= 0 | c <= 0){
			System.out.print("The number of rows and the number of columns must be positive integers.");
			System.exit(-1);
		}
		
		
		
		//declare matrices and then input values for them
		int[][] matrix1 = new int [r][c];
		int[][] matrix2 = new int [r][c];
		
		System.out.println("Values for the first matrix:");
		
		for (int x = 0; x < r; x++){
			System.out.println("Values of row " + x);
			for (int y = 0; y < c; y++){
				Scanner numbers = new Scanner(System.in);
				System.out.print("Value of matrix1[" + x + "][" + y + "] is: ");
				int value = numbers.nextInt();
				matrix1[x][y] = value;
			}
		}
		
		System.out.println();
		System.out.println();
		System.out.println("Values for the second matrix:");
		
		for (int x = 0; x < r; x++){
			System.out.println("Values of row " + x);
			for (int y = 0; y < c; y++){
				Scanner numbers = new Scanner(System.in);
				System.out.print("Value of matrix2[" + x + "][" + y + "] is: ");
				int value = numbers.nextInt();
				matrix2[x][y] = value;
			}
		}
		
		//addition
		System.out.println();
		System.out.println();
		System.out.println("Matrix1 + Matrix2:");
		for (int x = 0; x < r; x++){
			for (int y = 0; y < c; y++){
				int value = matrix1[x][y] + matrix2[x][y];
				System.out.printf("%5d " , value);
			}
			System.out.println();
		}
		
		//subtraction
		System.out.println();
		System.out.println();
		System.out.println("Matrix1 - Matrix2:");
		for (int x = 0; x < r; x++){
			for (int y = 0; y < c; y++){
				int value = matrix1[x][y] - matrix2[x][y];
				System.out.printf("%5d " , value);
			}
			System.out.println();
		}
		
		
		//for multiplication, copy and paste the first part of the code. 
		//matrices [m][n] and [n][r]
		//add an if statement --> if the column of matrix1 != row of matrix2 
		//then print "cannot multiply these matrices of these sizes"
		
		
		
		
		
	}

}
