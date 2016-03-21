
public class AnimalNode {

	private String name;
	private int numLegs;
	public AnimalNode next;
	
	//constructor with arguments 
	public AnimalNode (String name, int numLegs){
		
		if (numLegs < 0){
			numLegs = 0;
		}
		this.name = name;
		this.numLegs = numLegs;
		this.next = null;	 
	}
	
	//empty constructor - creating an object
	public AnimalNode(){
		
		this.name = "";
		this.numLegs = 0;
		this.next = null;
	}
	
	//print HouseNode info
	public void printInfo(){
		System.out.print("Name: " + this.name);
		System.out.println("   Number of Legs: " + this.numLegs);
	}

}
