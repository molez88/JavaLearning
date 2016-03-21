
public class NonContiguousArrays {

	public static void main(String[] args) {
		//declare an  array of 5 rows, 20 columns
		int[][] a = new int[5][20];
		
		//to access 3rd row, 15th element --> a[2][14]
		
		//declare an array of 5 rows, unknown columns
		//This is equivalent to declaring 5 array references
		
		int[][] b = new int [5][];	
		
		//allocate and assign various sizes of arrays as rows.
		b[0] = new int [20];
		b[1] = new int [10];
		b[2] = new int [30];
		//b[3] = new int [35];		--> b[3] is null
		b[4] = new int [50];
		
		
		int numcols = 0;
		
		for (int r = 0; r < b.length; r++){
			if (b[r] == null){
				continue;
			}
			for (int c = 0; c < b[r].length; c++){
				b[r][c] = numcols;
				numcols ++;
			}
			System.out.print(numcols +" ");
		}
		
		System.out.println();
		//declare c of 70 integers
		int[] c = new int [70];
		
		//initialize values of c to 100 -170
		for (int ix = 0; ix < c.length; ix++){
			c[ix] = ix + 100;
		}
		
		//Make c the 3rd row of matrix b
		b[2] = c;
		
		for (int r = 0; r < b.length; r++){
			if (b[r] != null){
				for (int col = 0; col < b[r].length; col++){
					System.out.print(b[r][col] + " ");
				}
			}
			System.out.println();
		}
		
		// if b were contigous, print the 56th element of b
		int element = 67;
		int contigb = 0;
		for (int r = 0; r < b.length; r++){
			if (b[r] == null){
				continue;
			}
			if (contigb + b[r].length < element){
				contigb += b[r].length;
				continue;
			}
			for (int col = 0; col < b[r].length; col++){
				contigb ++;
				if (contigb == element){
					System.out.print(b[r][col] +" ");
					break;
				}	
			}	
		}
		
		
	}

}
