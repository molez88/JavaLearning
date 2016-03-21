
public class SongNode {

	private String name;
	private String artist;
	public SongNode next;
	public SongNode prev;
	
	//constructor with arguments 
	public SongNode (String name, String artist){
		
		this.name = name;
		this.artist = artist;
		this.next = null;
		this.prev = null;
	}
	
	//empty constructor - creating an object
	public SongNode(){
		
		this.name = "";
		this.artist = "";
		this.next = null;
		this.prev = null;
	}
	
	//print HouseNode info
	public void printInfo(){
		System.out.print("Title: " + this.name);
		System.out.println("   Author: " + this.artist);
	}
}
