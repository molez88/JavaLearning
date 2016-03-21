
public class LinkedHouses2 {
	
	LNode head;
	
	//empty constructor
	public LinkedHouses2() {
		this.head = null;
	}
	
	public Object[] toArray(){
		Object[] nodes = new Object [this.length()];
		
		int ix = 0;
		for (LNode ln = this.head; ln != null; ln = ln.next){
			nodes[ix++] = ln.node;
		}
		return nodes;
	}
	
	/*//linked list traversal (print info on each node) 
	 * *******THERE IS NO PRINT OBJECT YET, CAN'T TRAVERSE 
	 * *******DIFFERENT LENGTH NODES(SONG,ANIMAL,ETC.)
	public void printList() {
		LNode ln = this.head;   
		
		while (ln != null){
			ln.node.printInfo();
			ln = ln.next;
		}
		System.out.println();
		
	}
	*/
	
	//add node to end of train
	public void append(Object h) {
		LNode ln = new LNode (h);
		
		if (this.head == null){
			head = ln;
			return;
		}
		
		LNode tail = head;
		while (tail.next != null){
			tail = tail.next;
		}
		tail.next = ln;
	}
	
	//add node to front of list (before the head)
	public void prepend(Object h) {
		LNode ln = new LNode (h);
		
		ln.next = this.head;
		this.head = ln;		
	}
	
	public void insert(Object h, int position){
		
		if (position == 0) {
			prepend(h);
		}
		
		int p = 1;
		LNode x = this.head;
		
		while(x != null){
			if (p == position){
				LNode ln = new LNode(h);
				ln.next = x.next;
				x.next = ln;
				position = -1;
				break;
			}
			x = x.next;
			p = p + 1;
		}
		if (position >= p){
			append(h);
		}
	}
	
	
	public Object delete(int position){
		int p = 0;
		LNode prev = null;
		LNode cur = this.head;
		
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
			return cur.node;
		}
		
		//else case - before the head
		this.head = cur.next;
		cur.next = null;
		return cur.node;
	}
	
	public int length(){
		int l = 0;
		LNode x = this.head;
		
		while(x != null){
			x = x.next;
			l = l + 1;
		}
		return l;	
	}
}
