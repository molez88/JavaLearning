
public class AnimalQueue {

	AnimalNode head;
	
	//empty constructor
	public AnimalQueue (){
		this.head = null;
	}
	
	//queue traversal (print info on each node)
	public void printList (){
		
		AnimalNode h = this.head;   
		
		while (h != null){
			h.printInfo();
			h = h.next;
		}
		System.out.println();
	}
	
	//add node to end of queue
	public void push(AnimalNode h){
		
		if (this.head == null){
			head = h;
			return;
		}
		
		AnimalNode tail = head;
		while (tail.next != null){
			tail = tail.next;
		}
		tail.next = h;
	}
	
	//delete node from front of list 
	public AnimalNode pop(){
		AnimalNode h = this.head;
		if (h == null){
			return null;
		}
		this.head = h.next;
		h.next = null;
		return h;
		
	}
}
