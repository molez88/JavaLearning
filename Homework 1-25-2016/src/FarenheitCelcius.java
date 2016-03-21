import java.util.Scanner;

public class FarenheitCelcius {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Temperature in Farenheit: ");
		float F = input.nextFloat();
		float C = (F - 32) * 5 / 9;
		/*
		System.out.println(F + "\u00B0F equals " + C + "°C");
		
		System.out.print("The temperature is ");
		if (C < 0) {
			System.out.print("below freezing.");
		}
		else if (C > 0) {
			if (C >= 100) {
				System.out.print("boiling.");
			} 
			else {
				System.out.print("above freezing.");
			}
			
		}
		else {
			System.out.println("freezing.");
		}
		*/
		
		System.out.println("     F      |      C        |         freezing/boiling  ");
		for (F = -20; F <= 100; F += 5) {
			C = (F - 32) * 5 / 9;
			System.out.print(F + "       |       " + C + "    |          ");
			if (C < 0) {
				System.out.println("below freezing");
			}
			else if (C > 0) {
				if (C >= 100) {
					System.out.println("boiling");
				} 
				else {
					System.out.println("above freezing");
				}
				
			}
			else {
				System.out.println("freezing");
			}
		}


	}

}


		
