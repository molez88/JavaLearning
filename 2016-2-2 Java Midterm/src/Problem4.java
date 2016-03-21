import java.util.Scanner;
public class Problem4 {
	
	public static boolean isprime (int x){
		for(int num = (int) Math.sqrt(x); num > 1; num -=1){
			if (x % num == 0) {
				return false;
			}
		}
		return true;
	}

	public static void main(String[] args) {
		
		//testing Method isprime
		boolean p45 = isprime (45);
		System.out.println(p45);
		
		boolean p103 = isprime(103);
		System.out.println(p103);
		//testing done
		
		
		
		Scanner input = new Scanner(System.in);
		System.out.print("Give a number: ");
		int num1;
		num1 = input.nextInt();
		if (isprime(num1)) System.out.print(num1 + " is prime.");
		else System.out.print(num1 + " is not prime.");
		
		/*
		boolean flag = false;
		if (flag) {
			System.out.println("flag is true");
		}
		else {
			System.out.println("flag is false");
		}
		int a = 10;
		boolean test = (a > 15);
		if (!test) {  // test == false, a <= 15, !(a > 15)
			System.out.println("a <= 15");
		}
		*/
		
		
		/*
		 * *******************************
		boolean prime = true;
		for(int num = (int) Math.sqrt(num1); num > 1; num -=1){
			if (num1 % num == 0) {
				prime = false;
			}
		}
		**********************************
		if (prime == true) System.out.print(num1 + " is prime.");
		else System.out.print(num1 + " is not prime.");
		*/

	}

}
