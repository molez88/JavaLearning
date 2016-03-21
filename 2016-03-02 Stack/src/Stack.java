
public class Stack {

	public static void main(String[] args) {
		// create stack
		BookStack bs1 = new BookStack();
		
		// create books
		BookNode b1 = new BookNode("Hunger Games", "Suzanne Collins");
		BookNode b2 = new BookNode("Harry Potter", "J.K. Rowling");
		BookNode b3 = new BookNode("My Sister's Keeper", "Jodi Picoult");
		BookNode b4 = new BookNode("Death on the Nile", "Agatha Christie");
		BookNode b5 = new BookNode("Romeo and Juliet", "William Shakespeare");
		BookNode b6 = new BookNode("Great Expectations", "Charles Dickens");
		
		bs1.push(b1);
		bs1.push(b2);
		bs1.push(b3);
		bs1.push(b4);
		bs1.push(b5);
		bs1.push(b6);
		
		bs1.printList();
		
		BookNode top = bs1.pop();
		bs1.printList();
		
		bs1.push(top);
		bs1.printList();
		

	}

}
