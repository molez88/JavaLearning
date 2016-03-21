
public class WhileLoops {

	public static void main(String[] args) {
		//for loop (intial; condition; post-loop) {}
		//while loop only has a condition (no initial or post-loop) in parens, they exist outside of 
		
		int ix = 0;
		while (ix < 100) {
			System.out.print(ix + " ");
			ix++;
			if (ix % 10 == 0){
				System.out.println();
			}
		}
		
		int iy = 0;
		do {
			System.out.print(iy + " ");
			iy++;
			
		} while (iy < 20);
		//in a dowhile loop, while is the post-condition
	}

}
