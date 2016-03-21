
public class Quadrilateral extends MyShape {
	public Quadrilateral(){
		super ("Quadrilateral", 4);	
	}
	
	public void printinfo(){
		
		System.out.print("This is a quadrilateral subclass.");
		super.printinfo();
	}

}