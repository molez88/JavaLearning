import java.io.*;
import java.util.Random;

public class RandomtoFile {

	public static void main(String[] args) {
		// write a function that will take two arguments, an integer and a file name
		// the integer will be the number of random numbers between 0 and 1000
		// the file name will be where all the numbers are written to
		
		if (args.length != 2){
			System.out.println("Usage is integer, File1.");
			System.exit(-1);
		}
		
		//open the file where the numbers will be written
		FileWriter target;
		try {
			target = new FileWriter (args[1]);
		} 
		catch (Exception e) {
			e.printStackTrace();
			System.exit(-1);
			return;
		}
		
		
		// random number generator and number of random numbers
		Random randomGenerator = new Random();
		int x = Integer.parseInt(args[0]);
		
		// write the random numbers to file
		try {
			for (int y = 0; y < x; y++){
				int num = randomGenerator.nextInt(1001);
				target.write(num + " ");
			}
		}
		catch (Exception e){
			e.printStackTrace();
			return;
		}
		
		// close target file 
		try{
			target.close();
		}
		catch (IOException cls){
			cls.printStackTrace();
			System.exit(-1);
		}
		

	}

}
