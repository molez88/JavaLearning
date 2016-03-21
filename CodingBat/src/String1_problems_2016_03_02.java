
public class String1_problems_2016_03_02 {
	
	public static String extraEnd (String str){
		// Given a string, return a new string made of 3 copies of the 
		// last 2 chars of the original string. 
		// The string length will be at least 2. 
		int l = str.length();
		String result;
		String end = Character.toString(str.charAt(l-2));
		String end2 = Character.toString(str.charAt(l-1));
		String fin = end.concat(end2);
		
		if (l < 2){
			result = "";
		}
		else{
			result = fin.concat(fin).concat(fin);
		}
		return result;
	}
	
	public static String conCat (String str1, String str2){
		// Given two strings, append them together (known as "concatenation") 
		// and return the result. However, if the concatenation 
		// creates a double-char, then omit one of the chars, so "abc" 
		// and "cat" yields "abcat". 
		
		int l = str1.length();
		String result;
		
		if (str1.charAt(l-1) == str2.charAt(0)){
			String str3 = str2.substring(1);
			result = str1.concat(str3);
		}
		else{
			result = str1.concat(str2);
		}
		
		return result;
	}
	
	public static String middleThree (String str){
		// Given a string of odd length, return the string 
		// length 3 from its middle, so "Candy" yields "and". 
		// The string length will be at least 3. 
		int length = str.length();
		String result;
		
		if (length % 2 == 0){
			result = "";
			return result;
		}
		
		if (length == 1){
			result = str.concat(str).concat(str);
			return result;
		}
		
		int mid3 = length/2;
		result = str.substring(mid3 - 1, mid3 + 2);
		return result;
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str = "Hello";
		int l = str.length();
		System.out.println(str.charAt(4));
		System.out.println(l);
		System.out.println(str.charAt(l-2));
		str.charAt(l-2);
		Character strEnd = str.charAt(l-2);
		Character strEnd2 = str.charAt(0);
		
		String end = strEnd.toString(str.charAt(l-2));
		String end2 = strEnd2.toString(str.charAt(0));
		
		
		char ch1 = str.charAt(2);
		char ch2 = str.charAt(4);
		
		if (ch1 == ch2){
			System.out.println("Ch: " + ch1 );
		}
		else {
			System.out.println("Ch1: " + ch1 + "    Ch2: " + ch2);
		}
		
		int e1 = (int) strEnd;
		int e2 = (int) strEnd2;
		
		System.out.println(e2);
		
		if (e1 == e2){
			System.out.println("yes");
		}
		else {System.out.println("no");}
		
		
		String fin = end.concat(end2);
		String result = fin.concat(fin).concat(fin);
		System.out.println(result);

	}

}
