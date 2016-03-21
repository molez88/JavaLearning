
public class Strings {
	
	public static int add(int a, int b){
		int result = a + b + 10;
		return result;
	}
	
	public static float circumference(float radius){
		float result = (float) (2 * Math.PI * radius);
		return result;
	}

	public static void main(String[] args) {
		// declaring an array, allocating 15 elements
		/*
		int [] array = new int [15];
		System.out.print(array.getClass());
		*/
		
		//testing Method add
		int p = add(5, 10);
		int q = add(500, 2000);
		System.out.println(p + ", " + q);
		
		
		//testing Method circumference
		float
		
		String xx = "abc";
		String yy = new String ("abc");
		String zz = "Hello World. Hello again.";
		int l = zz.length();
		String subzz = zz.substring(0, 5);
		String subzz1 = zz.substring(8, 12);
		System.out.println(l + " " + zz);
		// print all caps of zz
		System.out.println(zz.toUpperCase());
		// print first index of 'o'
		System.out.println(zz.indexOf('o')); //single quotes = single character code
		// print last index of 'l'
		System.out.println(zz.lastIndexOf("ll")); //double quotes = string --> -1 means that it doesn't exist
		// replace Hello with Goodbye
		System.out.println(zz.replace("Hello", "Goodbye"));
		//replace only first Hello with Goodbye
		System.out.println(zz.replaceFirst("Hello", "Goodbye"));
		//replace only the second Hello with Goodbye
		System.out.println(zz.replaceFirst(" Hello", "Goodbye")); //OR
		int x = zz.lastIndexOf("Hello");
		String subx1 = zz.substring(0, x);
		String subx = zz.substring(x);
		System.out.println(subx);
		String suby = subx.replace("Hello", "Goodbye");
		System.out.println(subx1.concat(suby));
		System.out.println(subx1 + suby); //for Strings, + is the same as concat
				
		
	}

}
