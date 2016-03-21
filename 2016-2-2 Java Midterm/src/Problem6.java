import java.util.Scanner;
public class Problem6 {
	
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
		System.out.print("Give a number: ");
		int num1;
		num1 = input.nextInt();
		System.out.println("The prime factors of " + num1 + " are: ");
		for (int x = num1; x > 1; x -=1){
			if((num1 % x == 0) && isprime(x)){
				System.out.print(x + " ");
			}
		}
		System.out.println();
		
		
		/*
		 * *******************************
		boolean prime = true;
		for(int num = (int) Math.sqrt(num1); num > 1; num -=1){
			if (num1 % num == 0) {
				prime = false;
			}
		}
		**********************************/

	}

}
