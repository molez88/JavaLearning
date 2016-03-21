import java.util.Scanner;
public class ConverttoMetric {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.print("Number of Inches: ");
		double in = input.nextDouble();
		System.out.print("Number of Feet: ");
		double ft = input.nextDouble();
		System.out.print("Number of Miles: ");
		double mi = input.nextDouble();
		double total = (mi * 5280 * 12) + (ft * 12) + in;
		double totalcm = (2.54 * total);
		
		double numofkm = Math.floor (totalcm / 100000);
		double numofm = Math.floor((totalcm - (numofkm * 100000)) / 100);
		double numofcm = totalcm - (numofkm * 100000) - (numofm * 100);
		
		//System.out.println(totalcm);
		
		System.out.println(mi + " miles, " + ft + " feet, and " + in + " inches is equal to ");
		System.out.println(numofkm + " kilometers, " + numofm + " meters, and " + numofcm + " centimeters");
		
		
	}

}
