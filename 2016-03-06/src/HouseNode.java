
public class HouseNode {

	private int numPeople;
	private int numPets;
	private int numRooms;
	private String address;
	
	//constructor with arguments 
	public HouseNode (int numPeople, int numPets, int numRooms, String address){
		
		if(numPeople < 0){
			numPeople = 0;
		}
		
		if (numPets < 0){
			numPets = 0;
		}
		
		this.numPeople = numPeople;
		this.numPets = numPets;
		this.numRooms = numRooms;
		this.address = address;
		 
	}
	
	//empty constructor - creating an object
	public HouseNode(){
		
		this.numPeople = 0;
		this.numPets = 0;
		this.numRooms = 1;
		this.address = "";
	}
	
	//print HouseNode info
	public void printInfo(){
		System.out.print("Address: " + this.address);
		System.out.print("   People: " + this.numPeople);
		System.out.print("   Pets: " + this.numPets);
		System.out.println("   Rooms: " + this.numRooms);
	}
	
	

}
