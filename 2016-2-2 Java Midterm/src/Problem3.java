
public class Problem3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int dash = 5; dash >= 1; dash -= 1){
			int num = 11 - 2*dash;
			//print 'dash' number of "-"
			for (int pc=0; pc < dash; ++pc) System.out.print("-");
			//print 'num' number of num
			for (int pc=0; pc < num; ++pc) System.out.print(num);
			//print 'dash' number of '-'
			for (int pc=0; pc < dash; ++pc) System.out.print("-");
			System.out.println();
		}

	}

}
