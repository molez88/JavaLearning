import java.util.Random;
public class RandomFtoC {

	public static void main(String[] args) {

		Random randomGenerator = new Random(); 
		double tempF [] = new double [20];
		
		//Generate 20 random temperatures in the range of 20 - 200
		for (int loc = 0; loc < tempF.length; loc++){
			tempF[loc] = Math.round(20 + randomGenerator.nextDouble() * 180);
		//	System.out.println("Temperature in " + loc + " is " + tempF[loc] + " ");
		}
		
		
		// converting the 20 random temperatures to Celcius
		double [] tempC = new double [tempF.length];
		
		for (int loc = 0; loc < tempC.length; loc++){
			tempC[loc] = (tempF[loc] - 32) * 5 /9;
		//	System.out.println(tempF[loc] + "\u00B0F equals " + tempC[loc] + "\u00B0C");	
		}
		
		
		for (int jj = 0; jj < tempF.length; jj++){
			System.out.println(tempF[jj] + "\u00B0F equals " + tempC[jj] + "\u00B0C");
		}
		

	}

}
