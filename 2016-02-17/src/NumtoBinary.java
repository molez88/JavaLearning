
public class NumtoBinary {
	
	public static int parseInt(String numstr){
		byte[] numbytes = numstr.getBytes();
		int argnum = 0;
		for (byte num:numbytes){
			int value = num - '0';
			argnum = argnum*10 + value;
		}
		return argnum;
		
		
	}

	public static void main(String[] args) {
		// multiple number of strings, convert the strings to numbers
		//for each argument, get all the characters in the string, from there, get 
		//the number value ("1" has number value 1, "7" has number value 7)
		//add numbers together (17 --> read 1, then multiply 1 by 10 add 7, *10 + new) etc.
		
		// 12 34 98 39 69 47 21 92 999 3487
		
		
		//this is basically the code for Integer.parseInt()
		
		for (String arg:args){
			int num = parseInt(arg);
			System.out.println(num + " ");
		}

	}

}
