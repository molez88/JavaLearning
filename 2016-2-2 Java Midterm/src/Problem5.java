
public class Problem5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a;
		int b;
		
		for (a = 1; a < 100; a++){
			for (b = 1; b < 100; b++){
				int c2 = a*a + b*b;
				int c = (int) Math.floor(Math.sqrt(c2));
				if (Math.sqrt(c2) == c){
					System.out.println("a = " + a + ", b = " + b + ", and c = " + c + " is a Pythagorean triplet");
				}
			}
		}
		
	
		
		
		/*
		if (Math.sqrt(c) == Math.floor(Math.sqrt(c))) {
			System.out.print(Math.sqrt(c));
		}
*/
	}

}
