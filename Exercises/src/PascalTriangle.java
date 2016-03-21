import java.util.Scanner;

public class PascalTriangle {
	
	public static long fact(int aa){
		long y = 1;
		for (int x = 1; x <= aa; x++){
			y = y * x;
			}
		long result = y;
		return result;
	}

	public static void main(String[] args) {
		//ask how many rows long you want the Pascal Triangle to go
		Scanner row = new Scanner(System.in);
		System.out.print("How many rows do you want in this representation of Pascal's Triangle?     ");
		int numrow = row.nextInt();
		
		//Print Pascal's Triangle (use matrices of row length 1 and column length numrow)
		
		for (int n = 0; n < numrow; n++){
			for (int r = 0; r < n; r++){
				long result = fact(n) / (fact(n-r) * fact(r));
				System.out.printf("%6d " , result);
				}
			System.out.printf("%6d \n" , 1);
			}
			//System.out.print(currow[1][x] + " ");
			//System.out.print(currow[1][x] + " ");
		}
	

}
