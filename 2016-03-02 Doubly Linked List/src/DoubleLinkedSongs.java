
public class DoubleLinkedSongs {
	
	SongNode head;
	
	//empty constructor
	public DoubleLinkedSongs (){
		this.head = null;
	}
	
	//linked list traversal (print info on each node)
	public void printList (){
		SongNode h = this.head;   
		
		while (h != null){
			h.printInfo();
			h = h.next;
		}
		System.out.println();
	}
	
	//add node to end of train
	public void append(SongNode h){
		
		if (this.head == null){
			head = h;
			h.prev = null;
			h.next = null;
			return;
		}
		
		SongNode tail = head;
		while (tail.next != null){
			tail = tail.next;
		}
		tail.next = h;
		h.prev = tail;
		h.next = null;
	}
	
	//add node to front of list (before the head)
	public void prepend(SongNode h){
		this.head.prev = h;
		h.next = this.head;
		this.head = h;
		h.prev = null;
	}
	
	public void insert(SongNode h, int position){
		
		int p = 1;
		SongNode x = this.head;
		
		if (position == 0) {
			prepend(h);
		}
		
		while(x != null){
			if (p == position){
				h.next = x.next;
				x.next.prev = h;
				x.next = h;
				h.prev = x;
			}
			x = x.next;
			p = p + 1;
		}
		
		if (position >= p){
			append(h);
		}
	}
	
	
	public SongNode delete(int position){
		int p = 0;
		SongNode cur = this.head;
		
		/*
		if  (position <= 0){
			return;
		}
		*/
		
		while(cur != null){
			if (p == position){
				break;
			}
			cur.prev = cur;
			cur = cur.next;
			p = p + 1;
		}
		
		//check if beyond the tail
		if (cur == null){
			return null;
		}
		
		//check if in the middle of the list
		if (cur.prev != null){
			cur.prev.next = cur.next;
			cur.next.prev = cur.prev;
			cur.next = null;
			cur.prev = null;
			return cur;
		}
		
		//else case - before the head
		this.head = cur.next;
		this.head.prev = null;
		cur.next = null;
		cur.prev = null;
		return cur;
	}
	
	public int length(){
		int l = 0;
		SongNode x = this.head;
		
		while(x != null){
			x = x.next;
			l = l + 1;
		}
		return l;		
	}
}
