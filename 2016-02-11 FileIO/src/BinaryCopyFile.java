import java.io.*; 			//for FileInputStream and FileOutputStream

public class BinaryCopyFile {

	public static void main(String[] args) {
		
		// this program will do what cp in terminal does - 
		//read one file and write it in another
		//given two arguments, first is the source, second is the target
		//read from source, write to target
		
		if (args.length != 2){
			System.out.println("Usage is copy File1 File2.");
			System.exit(-1);
		}		

		//read from first argument (args[0])
		FileInputStream source;
		try {
			source = new FileInputStream(args[0]);
		} 
		catch (FileNotFoundException e) {
			System.out.println("File Not Found; " + args[0] + " not available.");
			//e.printStackTrace();
			System.exit(-1);
			return;
		}
		
		
		FileOutputStream target;
		try {
			target = new FileOutputStream(args[1]);
		}
		catch (Exception e) {
			e.printStackTrace();
			System.exit(-1);
			return;
		}							//so far, only opened source and target
		
		while (true) {
			int ch;
			try {
				ch = source.read();
			}
			catch (IOException ioe){
				ioe.printStackTrace();
				break;
			}
			if (ch == -1){
				break;				//read characters, break if the end of the file,
			}						//and write characters down
			
			try{
				target.write(ch);
			}
			catch (IOException ioe2){
				ioe2.printStackTrace();
				break;
			}
		}
		
		
		//close source and target
		try{
			source.close();
			target.close();
		}
		catch (IOException cls){
			cls.printStackTrace();
			System.exit(-1);
		}		
		
		
		
	}

}
