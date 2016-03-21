
public class queue {

	public static void main(String[] args) {
		//create list
		AnimalQueue queue1 = new AnimalQueue();
		
		// create animals
		AnimalNode a1 = new AnimalNode("fish", 0);
		AnimalNode a2 = new AnimalNode("cat", 4);
		AnimalNode a3 = new AnimalNode("dog", 4);
		AnimalNode a4 = new AnimalNode("wolf", 4);
		AnimalNode a5 = new AnimalNode("kangaroo", 2);
		
		queue1.push(a1);
		queue1.push(a2);
		queue1.push(a3);
		queue1.push(a4);
		queue1.push(a5);
		
		queue1.printList();
		
		AnimalNode q1h1 = queue1.pop();
		queue1.printList();
		
		queue1.push(q1h1);
		queue1.printList();

	}

}
