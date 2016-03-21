
public class BookNode {

	private String title;
	private String author;
	public BookNode next;
	
	//constructor with arguments 
	public BookNode (String title, String author){
		
		this.title = title;
		this.author = author;
		this.next = null;	 
	}
	
	//empty constructor - creating an object
	public BookNode(){
		
		this.title = "";
		this.author = "";
		this.next = null;
	}
	
	//print HouseNode info
	public void printInfo(){
		System.out.print("Title: " + this.title);
		System.out.println("   Author: " + this.author);
	}

}
