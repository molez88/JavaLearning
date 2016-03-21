
public class ProgArgs {
	
	public static void main (String[] args){
		
		/*
		if (args.length < 2){
			System.out.print("Give two numbers as argument list.");
			return;
		}
		*/
		
		int num1;
		int num2;
		
		try {
			num1 = Integer.parseInt(args[0]);
			num2 = Integer.parseInt(args[1]);
		}
		
		/*
		catch (NumberFormatException ne){
			System.out.println("The argument is not in integer format. ");
			System.out.println(ne);
			return;
		}
		catch (ArrayIndexOutOfBoundsException aie){
			System.out.println("There are not enough arguments. ");
			System.out.println(aie);
			return;
		}
		*/
		
		catch(Exception e){
			System.out.println("There is an error processing arguments. ");
			System.out.println(e);
			System.exit(-1);
		}
		
		
		int start = Math.min(num1, num2);
		int end = Math.max(num1, num2);
		
		int y = 0;
		
		for (int x = start; x < end; x++){
			y = y + x;
		}
		System.out.println("The sum of the numbers between " + start + " and " + end + " is: " + y);
		
		
	}

}
