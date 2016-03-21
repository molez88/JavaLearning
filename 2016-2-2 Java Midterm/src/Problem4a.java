import java.util.Scanner;
public class Problem4a {
	
	
	public static boolean isprime (int x){
		for(int num = (int) Math.sqrt(x); num > 1; num -=1){
			if (x % num == 0) {
				return false;
			}
		}
		return true;
	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Give starting number: ");
		int num1;
		num1 = input.nextInt();
		
		System.out.print("Give ending number: ");
		int num2;
		num2 = input.nextInt();
		
		boolean firstnum = true;
		for (int x = num1; x < num2; x++){
			if(isprime(x)) {
				if (!firstnum) 
					System.out.print(", ");
				System.out.print(x);
				firstnum = false;
			}
		}
		System.out.println();
		System.out.println("These are the prime numbers between " + num1 + " and " + num2);
		

	}

}
