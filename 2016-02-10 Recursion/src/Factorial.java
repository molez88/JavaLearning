
public class Factorial {
	
	public static int fact(int x){
		
		if (x == 0 || x == 1){
			return 1;
		}
		else if (x < 0){
			System.out.println("No factorials for negative numbers.");
			System.exit(-1);
		}
		int y = x * fact(x-1);
		return y;
		
		
		/*
		int y = 1;
		for (; x >= 1; x-=1){
			y = y * x;
		}
		return y;
		
		*/
	}
	
	public static int sumofN(int x){
		int y = 0;
		for (; x > 0; x -= 1){
			y = y + x;
		}
		return y;
	}
	
	public static void main(String[] args) {
		int x = 1;
		int a = 1;
		
		try {
			x = Integer.parseInt(args[0]);
		}
		
		catch(NumberFormatException ne){
			System.out.println("The argument is not in integer format. ");
			System.out.println(ne);
			return;
		}
		catch(ArrayIndexOutOfBoundsException aie){
			System.out.println("There are not enough arguments. ");
			System.out.println(aie);
			System.exit(-1);;
		}
		
		
		try {
			a = Integer.parseInt(args[1]);
		}
		
		catch(NumberFormatException ne){
			System.out.println("The argument is not in integer format. ");
			System.out.println(ne);
			return;
		}
		catch(ArrayIndexOutOfBoundsException aie){
			a = x;
		}
		
		
		if (x < 0){
			System.out.println("No factorials for negative numbers.");
		}
		else {
			int f = fact(x);
			System.out.println(x + "! is " + f);
		}
		
		
		
		int s = sumofN(a);
		System.out.println("The sum of the natural numbers up to " + a + " is " + s);
		
		
		
		
	}

}
