
public class Arrays2 {

	public static void main(String[] args) {
		
		// 1st method
		int[] row;  // declaration of array	
		row = new int[15]; // allocation of 15 ints
		row[5] = 350;
		
		int[] row_new = new int[20];  // new array of 20
		row_new[5] = row[5];
		row = row_new; // now 'row' is pointing to array of 20

		
		// 2nd method
		int[] row2 = new int[20];  // declaration & allocation
		row2[0] = 1;
		row2[1] = 5;
		row2[2] = 77;
		
		// 3rd method
		int[] row3 = {10,22,333,45,15,690};  // declare, allocate and initialize
		row3[4] = 200;  // value 15 is overwritten with 200
		
		// same as 1st method
		int[] row4;
		row4 = new int[6];
		row4[0] = 10; // 
		row4[1] = 22;
		row4[2] = 333;
		row4[3] = 45;
		row4[4] = 15;
		row4[5] = 690;
		
		
		
		
		row[0] = 100;  // initialization
		row[0] = 200;  // assigning a new value
		row[0] = 101;  // rewritten
		System.out.println(row[5]);
		
		// print row[0] --> 101
		// print row[1] --> error/ junk
		row[14] = 1400;  // initialization

		int xx;  // declaration
		xx = 5;	 // initialization
		System.out.println(xx);
		
		/*
		for (int x = 0; x <= 10; x++){
			for (int y = 0; y <= 10; y+=2){
				System.out.println("x = " + x + ", y = " + y);
			}
			
		}
		
		
		//triangle x = 1-10, y = 1-10, print hypotenuse
		
		for (int x = 1; x <= 10; x++){
			for (int y = 1; y <= 10; y++){
				float z = (float) Math.sqrt(x*x + y*y);
				System.out.println("x = " + x + ", y = " + y + ", hypotenuse = " + z);
			}
		}
		*/
		
		//find Pythgorean triplets with x = 1-100, y = 1-100
		
		for (int x = 1; x <= 100; x++){
			for (int y = 1; y <= 100; y++){
				float z = (float) Math.sqrt(x*x + y*y);
				if(z == Math.floor(z)){
					System.out.println("x = " + x + ", y = " + y + ", hypotenuse = " + z);
				}
				
			}
		}

	}

}
