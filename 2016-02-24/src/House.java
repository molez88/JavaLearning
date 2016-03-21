
public class House {
	
	private int numPeople;
	private int numPets;
	private int numRooms;
	private String address;
	private String city;
	private String state;
	private String zipcode;
	
	public House() { // empty constructor
		this.numPeople = 1;
		this.numPets = 0;
		this.numRooms = 2;
		this.address = "";
		this.city = "";
		this.state = "";
		this.zipcode = "";
		
	}
	//read and write methods for state
	public int getNumPeople(){
		return numPeople;
	}
	public void setNumPeople(int numPeople){
		this.numPeople = numPeople;
	}
	
	public int getNumPets(){
		return numPets;
	}
	
	public int getNumRooms(){
		return numRooms;
	}
	
	public String getAddress(){
		return address;
	}
	
	public String getCity(){
		return city;
	}
	
	public String getState(){
		return state;
	}
	
	public String getZipcode(){
		return zipcode;
	}
	
	public House(int numPeople, int nPets, int nRooms, 
			String address, String city, String state, String zipcode){
		
		int a = numPeople + 10;
		int b = nPets + 20;
		int c = numRooms + 4;

		this.numPeople = numPeople;
		numPets = nPets;
		this.numRooms = nRooms;
		
	}
}
