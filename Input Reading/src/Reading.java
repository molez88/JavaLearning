import java.util.Scanner;

public class Reading {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.print("How old are you?     ");
		int age;
		age = input.nextInt();
		System.out.println("You are " + age + " years old.");

	}

}
