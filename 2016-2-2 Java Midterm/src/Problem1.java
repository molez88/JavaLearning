import java.util.Random;
import java.util.Scanner;
public class Problem1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random randomGenerator = new Random();
		int num1 = randomGenerator.nextInt(10) + 1;
		int num2 = randomGenerator.nextInt(10) + 1;
		int opcode = randomGenerator.nextInt(4);
		int correctanswer = 0;
		
		if (opcode == 0){
			System.out.print(num1 + " + " + num2 + " = ");
			correctanswer = num1 + num2;
		}
		if (opcode == 1){
			System.out.print(num1 + " - " + num2 + " = ");
			correctanswer = num1 - num2;
		}
		if (opcode == 2){
			System.out.print(num1 + " * " + num2 + " = ");
			correctanswer = num1 * num2;
		}
		if (opcode == 3){
			System.out.print(num1 + " / " + num2 + " = ");
			correctanswer = num1 / num2;
		}

		Scanner input = new Scanner(System.in);
		int answer;
		answer = input.nextInt();
		
		if (correctanswer == answer){
			System.out.println("Right!");
		}
		else {
			System.out.println("Wrong! The correct answer is: " + correctanswer);
		}
		
		
		
		
		
		
		
		
		

		
	}

}
