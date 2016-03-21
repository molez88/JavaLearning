
public class Arrays {

	public static void main(String[] args) {
		int ix;
		
		int [] ar = new int [10];
		
		ar[0] = 10;
		ar[1] = 20;
		ar[2] = 30;
		ar[3] = 40;
		ar[4] = 50;
		ar[5] = 60;
		ar[6] = 70;
		ar[7] = 80;
		ar[8] = 90;
		ar[9] = 100;
		
		//System.out.print(ar[4]);
	
		
		
		double [] tempF = new double [10];
		
		tempF[0] = 8; // shrewsbury
		tempF[1] = 15.2;  // Boston
		tempF[2] = 35.5;  // New York
		tempF[3] = 42.6;  // DC
		tempF[4] = 82.2;    // Tampa
		tempF[5] = 90.1;   // Dallas
		tempF[6] = 72;	// San Diego
		tempF[7] = 0;
		tempF[8] = 0;
		tempF[9] = -90;	// Antartica
		
		System.out.println("Number of location is " + tempF.length);
		
		for (int loc = 0; loc < tempF.length; loc++){
			//System.out.println("Temperature in " + loc + " is " + tempF[loc] + " ");
			
		}
		double citytempF = 0;
		for (int loc = 0; loc < 10; loc++){
			tempF[loc] = citytempF;
			citytempF += 5;
			
		//	System.out.println("Temperature in " + loc + " is " + tempF[loc] + " ");
			
		}
		// declare an array of 10 doubles
		double [] tempC = new double [tempF.length];
		
		for (int loc = 0; loc <10; loc++){
			tempC[loc] = (tempF[loc] - 32) * 5 /9;
			
		//	System.out.println(tempF[loc] + "\u00B0F equals " + tempC[loc] + "\u00B0C");
					
		}
		
		for (int jj = 0; jj < 10; jj++){
			System.out.println(tempF[jj] + "\u00B0F equals " + tempC[jj] + "\u00B0C");
		}
		
	}

}
