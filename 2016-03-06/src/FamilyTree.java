import java.util.Vector;

public class FamilyTree {
	
	//using vectors so number of children can change
	String name;
	//Vector of family trees
	Vector<FamilyTree> children;
	FamilyTree parent;
	
	//constructor
	public FamilyTree(String name) {
		this.name = name;
		this.children = new Vector();
		this.parent = null;
	}
	
	public FamilyTree addChild(FamilyTree child) {
		children.add(child);
		child.parent = this;
		return child;
	}
	
	public FamilyTree addChild(String name) {
		FamilyTree kid = new FamilyTree(name);
		return addChild(kid);
	}
	
	public void print(int level){
		int spaces = level * 10;
		for (int ix = 0; ix < spaces; ix++){
			System.out.print(" ");
		}
		System.out.println(this.name);
		for (FamilyTree kid : this.children){
			kid.print(level + 1);
		}
	}
	
}
