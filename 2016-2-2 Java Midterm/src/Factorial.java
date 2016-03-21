import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.print("Give a number: ");
		int num1;
		num1 = input.nextInt();
		System.out.print(num1 + "! = ");
		int y = 1;
		for (int x = 1; x <= num1; x++){
			y = y * x;
			}
		System.out.print(y);
		}

		 
	}

