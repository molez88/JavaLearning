import java.util.Scanner;
public class SumofNumbers {

	public static void main(String[] args) {
		// sum of the numbers between two numbers (ex sum 10 - 20 = 10 + 11 + ... + 19)

		Scanner input = new Scanner(System.in);
		System.out.print("Give a number: ");
		int num1;
		num1 = input.nextInt();
		System.out.print("Give a second number: ");
		int num2;
		num2 = input.nextInt();
/*		
		int start;
		int end;
		
		if (num1 < num2){
			start = num1;
			end = num2;
		}
		
		else {
			start = num2;
			end = num1;
		}
	*/
		/*
		int start = num1;
		int end = num2;
		if (start > end) {
			start = num2;
			end = num1;
		}
		*/
		int start = Math.min(num1, num2);
		int end = Math.max(num1, num2);
		
		System.out.print("The sum of the numbers between " + start + " and " + end + " is:");
		int y = 0;
		
		
		for (int x = start; x < end; x++){
			y = y + x;
		}
		System.out.println(" " + y);
			
	}	
	
	
}
		
		
	
		
	


