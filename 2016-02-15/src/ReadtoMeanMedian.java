import java.io.*;
import java.util.Scanner;
import java.util.Arrays;
public class ReadtoMeanMedian {

	public static void main(String[] args) {
		
		// write a program to read a list of numbers from a file and 
		// print the following statistics to System.out
		//statistics are: count of numbers, mean, sum, median
		
		if (args.length != 1){
			System.out.println("Usage is read File1.");
			System.exit(-1);
		}
		
		//use RandomAccessFile instead of FileReader; 
		//rewind to starting position using seek method
		
		FileReader source;
		try {
			source = new FileReader(args[0]);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
			return;
		}

		//reading a list for integers
		
		Scanner list = new Scanner(source);
		
		int count = 0;
		
		for (;;){
			if (list.hasNextInt()){
				int x = list.nextInt();
				count = count + 1;			
			}
			else break;
		}
		
		//closing source so we can reread it when assigning values to the array
		
		//randomaccessfile
		
		try {
			source.close();
		} 
		catch (IOException cls){
			cls.printStackTrace();
			System.exit(-1);
		}		
	
		//assigning integers to an array
		
		int[] row = new int[count];
		
		//reset source so we can read the list again
		
		FileReader source2;
		
		try {
			source2 = new FileReader(args[0]);
		} 
		catch (FileNotFoundException e) {
			e.printStackTrace();
			return;
		}
		
		Scanner list2 = new Scanner(source2);
		int sum = 0;
		int min = 0;
		int max = 0;
		
		for (int y = 0; y < count ; y++){
			if (list2.hasNextInt()){
				row[y] = list2.nextInt();
				//System.out.print(row[y] + " ");
				sum = sum + row[y];
				if (y == 0){
					min = row[y];
					max = row[y];
				}
				min = Math.min(min, row[y]);
				max = Math.max(max,  row[y]);
			}
			else break;
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
		
		//sort the array
		
		Arrays.sort(row);
		
		//calculating mean
	
		double mean = (sum / count);
		
		//print the statistics
		
		//System.out.println();
		System.out.println();
		System.out.printf("%32s %4d\n" , "Count of numbers:" , count);
		System.out.printf("%32s %4d\n" , "Sum of numbers:" , sum );
		System.out.printf("%32s %4d\n" , "Smallest Number: " , min);
		System.out.printf("%32s %4d\n" , "Largest Number:" , max );
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
