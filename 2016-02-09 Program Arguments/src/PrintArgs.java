
public class PrintArgs {

	public static void main(String[] args) {
		
		/*
		for (int x = 0; x < args.length; x++){
			String a = args[x];
			System.out.print(a + " ");
		}
		*/
		
		for (String a: args){			//for each element syntax - only works for arrays
			System.out.print(a + " ");
		}
		

	}

}
