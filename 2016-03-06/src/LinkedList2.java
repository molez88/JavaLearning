
public class LinkedList2 {

	public static void main(String[] args) {
		/*
		LinkedHouses2 list = new LinkedHouses2();
		HouseNode h1 = new HouseNode (5,5,5, "56 something");
		HouseNode h2 = new HouseNode (4,4,4, "57 something");
		HouseNode h3 = new HouseNode (3,3,3, "58 something");
		HouseNode h4 = new HouseNode (2,2,2, "59 something");
		
		BookNode b1 = new BookNode ("Harry Potter", "J.K.Rowling");
		
		double x = '0';
		
		list.append(h1);
		list.append(h2);
		list.append(h3);
		list.insert(h1, 1);
		list.append(h4);
		list.insert("Hello", 3);
		list.insert(x, 4);
		list.append(b1);
		
		Object[] houses = list.toArray();
		
		
		
		for (Object h: houses) {
			if (h instanceof HouseNode){
				HouseNode hn = (HouseNode) h;
				hn.printInfo();
			}
			else if (h instanceof String){
				System.out.println("This is a string.    " + (String) h);
			}
			else {System.out.println(h.getClass().getName() + ":   " + h);}
		}
		System.out.println();
		*/
		
		BinaryTree bt1 = new BinaryTree();
		
		bt1.add("55");
		bt1.add("22");
		bt1.add("74");
		bt1.add("41");
		bt1.add("58");
		bt1.add("38");
		bt1.add("22");
		bt1.add("93");
		int c = bt1.count();
		
		bt1.printInfix();
		
		bt1.printReverse();
		
		System.out.println("Count of bt1: " + c);
		
		
		BinaryTree expr = new BinaryTree();
		
		TNode t1 = expr.createBranch("+", new TNode ("a"), new TNode ("b"));
		TNode t2 = expr.createBranch("-", new TNode ("c"), new TNode ("d"));
		TNode t3 = expr.createBranch("*", t1, t2);
		expr.root = t3;
		
		
		//TNode t4 = expr.createBranch("+", new TNode ("a"), new TNode ("b"));
		//TNode t5 = expr.createBranch("+", new TNode ("a"), new TNode ("b"));
		//TNode t6 = expr.createBranch("+", new TNode ("a"), new TNode ("b"));
		//TNode t7 = expr.createBranch("+", new TNode ("a"), new TNode ("b"));
		
		expr.printInfix();
		expr.printPostfix();
		int d = expr.depth();
		System.out.println("Depth of expr: " + d);
		
		
		
		FamilyTree allen = new FamilyTree("Allen");
		FamilyTree bruce = allen.addChild("Bruce");
		FamilyTree carter = allen.addChild("Carter");
		FamilyTree jason = bruce.addChild("Jason");
		FamilyTree tim = bruce.addChild("Tim");
		FamilyTree richard = bruce.addChild("Richard");
		FamilyTree steve = carter.addChild("Steve");
		FamilyTree cass = tim.addChild("Cass");
		FamilyTree marie = richard.addChild("Marie");
		FamilyTree rachel = steve.addChild("Rachel");
		FamilyTree lyla = rachel.addChild("Lyla");
		FamilyTree tony = rachel.addChild("Tony");
		
		allen.print(0);

	}

}
