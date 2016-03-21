import java.util.Random;

public class HW2Random {

	public static void main(String[] args) {
		
		System.out.println("Generating ten random numbers between 1 and 100");
		Random randomGenerator = new Random();
		for (int num = 1; num <= 10; num++){
			int Randomnum = 1 + randomGenerator.nextInt(100);
			System.out.println("Generated: " + Randomnum);
		}
	}
}
