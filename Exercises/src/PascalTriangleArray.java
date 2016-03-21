import java.util.Scanner;
public class PascalTriangleArray {
	
	public static void printArray(long[] array) {
	       for (int x = 0; x < array.length; x++) {
	           System.out.print(array[x] + " ");
	       }
	       System.out.println();
	   }

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
	    System.out.print("How many rows do you want in this representation of Pascal's Triangle? ");
	    int row = input.nextInt();
		
		long[] previousRow;
		long[] currentRow = {1};
		
		printArray(currentRow);
		
		previousRow = currentRow;
		
		for (int x = 2; x <= row; x++) {
	           currentRow = new long[x];
	           currentRow[0] = 1;
	           currentRow[x - 1] = 1;
	           for (int y = 0; y <= x - 3; y++) {
	               currentRow[y + 1] = previousRow[y] + previousRow[y + 1];
	           }
	           printArray(currentRow);
	           previousRow = currentRow;
	       }
		
		
		
		
	}

}
