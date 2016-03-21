
public class Triangle extends MyShape {
	public Triangle(){
		super ("Triangle", 3);	
	}
	
	public void printinfo(){
		
		System.out.print("This is a triangle subclass.");
		super.printinfo();
	}

}



