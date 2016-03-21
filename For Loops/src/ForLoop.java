
public class ForLoop {
	
// single line comment
	
	public static void main(String[] args) {	
		int ix = 0;
		for ( ; ; ) {	 // for (;;) { }
			if (ix > 10) 
				break;
			System.out.print(ix+ " ");
			++ix;
		}
		System.out.println("end of for loop: " + ix);
		
	}
}


