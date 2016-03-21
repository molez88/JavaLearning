import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.Scanner;

public class ReadFileMatrixfunctions {
	
	public static int[][] getMatrixfromFile (String filename){

		RandomAccessFile source;
		try {
			source = new RandomAccessFile(filename, "r");
		} 
		catch (FileNotFoundException e) {
			e.printStackTrace();
			return null;
		}

		//reading a list for integers
		
		//source.readInt();
		//errors: readInt read 4 bytes at a time,
		//use readFile instead
		
		String line;
		int rowcount = 0;
		int colcount = 0;
		
		for(;;){
			try {
				line = source.readLine();
				if (line == null){
					break;
				}
				rowcount++;
			} 
			catch (IOException e1) {
				e1.printStackTrace();
				return null;
			}

			Scanner list = new Scanner(line);
			int numcols = 0;
			
			for (;;){
				if (list.hasNextInt()){
					int x = list.nextInt();
					numcols++;
				}
				else break;
			}
			
			if (colcount == 0){
				colcount = numcols;
			}
			else {
				if (colcount != numcols){
					System.out.println("Matrix doesn't have same number of columns in each row.");
					return null;
				}
			}
		}

		//assigning integers to a matrix
		int[][] result = new int[rowcount][colcount];

		//reset source so we can read the list again
		try {
			source.seek(0);
		} 
		catch (IOException e) {
			e.printStackTrace();
			return null;
		}
		
		//new Scanner and list needed
		String line2;
		
		for (int x = 0; x < rowcount; x++){
			try {
				line2 = source.readLine();
				if (line2 == null){
					break;
				}
			} 
			catch (IOException e1) {
				e1.printStackTrace();
				return null;
			}
			
			Scanner list2 = new Scanner(line2);
			
			for (int y = 0; y < colcount ; y++){
				if (list2.hasNextInt()){
					result[x][y] = list2.nextInt();
					//System.out.print(row[y] + " ");
				}
				else break;
			}
		}
		
		//closing opened file because there are no more
		//references to 'source' in the rest of the code
		try {
			source.close();
		} 
		catch (IOException cls){
			cls.printStackTrace();
			System.exit(-1);
		}
		return result;
	}
	
	
	public static int[][] Add(int[][] matr1, int[][] matr2){
		int r1 = matr1.length;
		int c1 = matr1[0].length;
		int r2 = matr2.length;
		int c2 = matr2[0].length;
		
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
		int r1 = matr1.length;
		int c1 = matr1[0].length;
		int r2 = matr2.length;
		int c2 = matr2[0].length;
		
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
	
	
	public static int[][] multiply(int[][] matr1, int[][] matr2){
		int r1 = matr1.length;
		int c1 = matr1[0].length;
		int r2 = matr2.length;
		int c2 = matr2[0].length;

		//dimension error
		if (c1 != r2){
			System.out.println("Matrix dimensions are incompatible.");
			System.exit(-1);
		}
		
		//declare size of result array
		int[][] result = new int[r1][c2];
		
		
		
		
		for (int i = 0; i < r1; i++){
			for (int j = 0; j < c2; j++){
				for (int k = 0; k < c1; k++){
					result[i][j] += matr1[i][k]*matr2[k][j];
				}
			}
		}
		
		return result;
		
	}
	
	public static void main(String[] args) {
		// in this program, multiply matrices after reading from file
				
		if (args.length != 2){
			System.out.println("Input is MatrixFile1 MatrixFile2.");
			System.exit(-1);
		}
		
		//declare and initialize two matrices
		int[][] Matrix1 = getMatrixfromFile(args[0]);
		int[][] Matrix2 = getMatrixfromFile(args[1]);
		
		//check for null(errors)
		if (Matrix1 == null || Matrix2 == null){
			System.out.println("The matrices are invalid.");
			System.exit(-1);
		}

		/*
		//add and print sum of two matrices
		System.out.println("The sum of Matrix1 and Matrix2 is:");
		int[][] sum = Add(Matrix1, Matrix2);
		int rowa = sum.length;
		int columna = sum[0].length;
		
		for (int x = 0; x < rowa; x++){
			for (int y = 0; y < columna; y++){
				System.out.printf("%5d " , sum[x][y]);
			}
			System.out.println();
		}
			
		//add and print sum of two matrices
		System.out.println();
		System.out.println("The difference of Matrix1 and Matrix2 is:");
		int[][] sub = Sub(Matrix1, Matrix2);
		int rows = sum.length;
		int columns = sum[0].length;
				
		for (int x = 0; x < rows; x++){
			for (int y = 0; y < columns; y++){
				System.out.printf("%5d " , sub[x][y]);
			}
			System.out.println();
		}
		*/
		int[][] mul = multiply(Matrix1,Matrix2);
		for (int[] r:mul) {
			for(int c:r) {
				System.out.printf("%5d ",c);
			}
			System.out.println();
		}
		
		
	}

}
