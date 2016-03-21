import java.util.*;
public class Testing {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);		
		System.out.print("The value of a is: ");
		int a = input.nextInt();
		System.out.print("The value of b is: ");
		int b = input.nextInt();
		
		if (a > b) {
			System.out.println(a + " is greater than " + b);
		}
		else if (a < b) {
			System.out.println(a + " is less than " + b);
		}
		else {
			System.out.println(a + " is equal to " + b);
		}
		
		boolean test = !(a > b);
		System.out.println("test = " + test);
		
	}

}
// >= greater than or equal to
// <= less than or equal to 
// != not equal to 
// && ANDing two conditions (a>b AND b<c)
// || means OR (a>b OR c>d) --> || (shift + backslash)
// know the boolean rules of precedence
// if (b1 && b2 && b3 || b4)
// if (! (b1 && b2 && b3 || b4)) = if (!b1 || !b2 || !b3 && !b4)

