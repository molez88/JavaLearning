import java.util.Random;
import java.util.Arrays;
public class MeanMedian {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Random randomGenerator = new Random();
		int x = randomGenerator.nextInt(6) + 15;
		
		int[] row = new int [x];		// declare, allocate and initialize
		
		float sum = 0;
		
		//generating x random values 1-50 and storing in row, calculating sum
		for (int y = 0; y < x; y++){
			row[y] = randomGenerator.nextInt(50) + 1;
			System.out.print(row[y] + " ");
			sum = row[y] + sum;
		}
		
		//printing sorted values
		Arrays.sort(row);
		System.out.println();
		System.out.println("These are the sorted numbers.");
		
		for (int y: row){
			System.out.print(y + " ");
		}
		
		//calculating and printing count, sum, and mean of numbers
		double mean = (sum / x);
		System.out.println();
		System.out.println();
		System.out.printf("%32s %4d\n" , "Count of numbers:" , x);
		System.out.printf("%32s %4d\n" , "Sum of numbers:" , (int) sum );
		System.out.printf("%32s %7.2f\n" , "Arithmatic mean of numbers:" , mean);
		
		//calculating median
		int a = row.length;
		if (a % 2 == 0){
			double mediane = (row[a / 2] + row[(a / 2) - 1]) / 2.0;
			System.out.printf("%32s %6.1f\n" , "The median of these numbers is:" , mediane);
		}
		
		else {
			double mediano = row[a / 2];
			System.out.printf("%32s %6.1f\n" , "The median of these numbers is:" , mediano);
		}
		
		
		
	}

}
