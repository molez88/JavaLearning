
public class HextoDec {
	
	public static int Base16toInt (String hex){
		
		byte[] numbytes = hex.getBytes();
		int decnum = 0;
		for (byte num:numbytes){
			int value = 0;
			if (num >= '0' && num <= '9'){
				value = num - '0';
			}
			else if (num >= 'A' && num <= 'F'){
				value = num - 'A' + 10;
			}
			else if (num >= 'a' && num <= 'f'){
				value = num -'a' + 10;
			}
			else {
				value = 0;
				decnum = -1;
				break;
			}
			decnum = decnum*16 + value;
		}
		
		return decnum;
	}

	
	
	public static void main(String[] args) {
		// write a method that takes hexadecimal string and returns an integer 
		// given multiple strings of numbers in hexadecimal format
		// return integer form (print in base 10)
		// a4 3f23 12adf 356ce 9775 ff468
		
		for (String arg:args){
			int num = Base16toInt(arg);
			if (num == -1){
				System.out.println(arg + ": Invalid Character - Hexadecimal only takes numbers between 0-9 and letters between a-f");
			}
			else{
				System.out.println(arg + " is equal to " + num + " ");
			}
			
		}
		
		
		

	}

}
