import java.io.*;
public class FtoCwithOutputFile {

	
	public static void main(String[] args) {

		if (args.length != 1){
			System.out.println("Usage is write File1.");
			System.exit(-1);
		}
		
		FileWriter target;
		try {
			target = new FileWriter (args[0]);
		} 
		catch (Exception e) {
			e.printStackTrace();
			System.exit(-1);
			return;
		}

		
		float F = 0;
		float C = (F - 32) * 5 / 9;
		
		try {
			target.write ("       F       |          C          |    freezing/boiling  \n");
		} 
		catch (IOException e) {
			e.printStackTrace();
			return;
		}
		
		try {
			for (F = -20; F <= 100; F += 5) {
				C = (F - 32) * 5 / 9;
				// System.out.printf("%32s %4d\n" , "Count of numbers:" , x);
				//System.out.printf("   %7.2f     |     %8.2f        |     ", F , C );
				String string1 = String.format("   %7.2f     |     %8.2f        |     ", F , C );
				target.write(string1);
				
				if (C < 0) {
					target.write("below freezing \n");
				}
				else if (C > 0) {
					if (C >= 100) {
						target.write("boiling \n");
					} 
					else {
						target.write("above freezing \n");
					}
					
				}
				else {
					target.write("freezing \n");
				}
			}
		}
		catch (Exception e){
			e.printStackTrace();
			return;
		}
		
		//close source and target
		try{
			target.close();
		}
		catch (IOException cls){
			cls.printStackTrace();
			System.exit(-1);
		}
				


		

	}

}





