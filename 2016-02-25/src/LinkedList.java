
public class LinkedList {

	public static void main(String[] args) {
		// create and instantiate the linked list
		
		LinkedHouses street1 = new LinkedHouses();
		LinkedHouses street2 = new LinkedHouses();
		//create housenodes
		HouseNode h1 = new HouseNode (4, 1, 6, "1 Main St.");
		HouseNode h2 = new HouseNode (2, 0, 3, "2 Main St.");
		HouseNode h3 = new HouseNode (3, 3, 8, "3 Main St.");
		HouseNode h4 = new HouseNode (5, 0, 4, "4 Main St.");
		HouseNode h5 = new HouseNode (1, 1, 8, "5 Main St.");
		HouseNode h0 = new HouseNode (4, 2, 8, "1 Lane St.");
		
		HouseNode h00 = new HouseNode (5, 5, 5, "5 Place St");
		HouseNode hi3 = new HouseNode (6, 6, 6, "44 Nice St");
		HouseNode h99 = new HouseNode (10, 10, 10, "10 Lion St");
		
		//add them to the street
		street1.append(h1);
		street1.append(h2);
		street1.append(h3);
		street1.append(h4);
		street1.append(h5);
		
		//add a housenode to the beginning of the list
		street1.prepend(h0);
		
		//insert
		street1.insert(h00, 0);
		street1.insert(hi3, 3);
		street1.insert(h99, 9);
		
		//print list
		street1.printList();
		
		HouseNode d5 = street1.delete(5);
		street1.printList();
		
		street1.insert(d5, 5);
		street1.printList();
		int length = street1.length();
		System.out.println(length);
		
		int length2 = street2.length();
		System.out.println(length2);
		/*
		street1.append(d5);
		street1.printList();
		*/
		
		
	}

}
