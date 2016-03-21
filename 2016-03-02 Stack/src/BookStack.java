
public class BookStack {

	BookNode head;
	
	//empty constructor
	public BookStack (){
		this.head = null;
	}
	
	//Stack traversal (print info on each node)
	public void printList (){
		
		BookNode h = this.head;   
		
		while (h != null){
			h.printInfo();
			h = h.next;
		}
		System.out.println();
	}
	
	//add node to end(top) of stack
	public void push(BookNode h){
		
		h.next = this.head;
		this.head = h;
	}
	
	//delete node from end(top) of stack 
	public BookNode pop(){
		BookNode h = this.head;
		if (h == null){
			return null;
		}
		this.head = h.next;
		h.next = null;
		return h;
		
	}
}
