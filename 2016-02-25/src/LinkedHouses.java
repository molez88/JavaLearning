
public class LinkedHouses {
	
	HouseNode head;
	
	//empty constructor
	public LinkedHouses (){
		
		this.head = null;
		
	}
	
	//linked list traversal (print info on each node)
	public void printList (){
		
		HouseNode h = this.head;   
		
		while (h != null){
			h.printInfo();
			h = h.next;
		}
		System.out.println();
		
		/*
		if (h == null){
			return;
		}
		while (h.next != null){
			h.printInfo();
			h = h.next;
		}
		h.printInfo();
		*/
	}
	
	//add node to end of train
	public void append(HouseNode h){
		
		if (this.head == null){
			head = h;
			return;
		}
		
		HouseNode tail = head;
		while (tail.next != null){
			tail = tail.next;
		}
		tail.next = h;
	}
	
	//add node to front of list (before the head)
	public void prepend(HouseNode h){
		
		h.next = this.head;
		this.head = h;		
	}
	
	public void insert(HouseNode h, int position){
		
		int p = 1;
		HouseNode x = this.head;
		
		if (position == 0) {
			prepend(h);
		}
		
		while(x != null){
			if (p == position){
				h.next = x.next;
				x.next = h;
			}
			x = x.next;
			p = p + 1;
		}
		
		if (position >= p){
			append(h);
		}
	}
	
	
	public HouseNode delete(int position){
		int p = 0;
		HouseNode prev = null;
		HouseNode cur = this.head;
		
		/*
		if  (position <= 0){
			return;
		}
		*/
		
		while(cur != null){
			if (p == position){
				break;
			}
			prev = cur;
			cur = cur.next;
			p = p + 1;
		}
		
		//check if beyond the tail
		if (cur == null){
			return null;
		}
		
		//check if in the middle of the list
		if (prev != null){
			prev.next = cur.next;
			cur.next = null;
			return cur;
		}
		
		//else case - before the head
		this.head = cur.next;
		cur.next = null;
		return cur;
	}
	
	public int length(){
		int l = 0;
		HouseNode x = this.head;
		
		while(x != null){
			x = x.next;
			l = l + 1;
		}
		return l;	
		
		
	}
	
	
}
