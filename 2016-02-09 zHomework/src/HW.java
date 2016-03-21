import java.util.Scanner;

public class HW {

	public static void printPartitions(String str, int prev, int cur) {
		int len = str.length();
		if (len > 0 && cur == 0) {
			System.out.println(str);
			return;
		}
		for (int num = cur; num > 0; num--) {
			if (num <= prev) {
				String newstr = str + " ";
				newstr = newstr + num;
				printPartitions(newstr,num,cur-num);
			}
		}
	}
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.print("Give a number: ");
		int num1 = input.nextInt();
		
		printPartitions("",num1,num1);
		
		
	}

}


//x = generate random number between 15 and 20
//generate x number of random numbers between 1 and 50
//find mean and median of list
