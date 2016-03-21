//each node has at most 2 children
public class BinaryTree {
	
	TNode root;
	
	public BinaryTree(){
		this.root = null;
	}
	
	public BinaryTree(String h){
		this.root = new TNode(h);
	}
	
	private void insert(TNode parent, TNode t){
		if (t.node.compareTo(parent.node) < 0){
			if (parent.left == null){
				parent.left = t;
				return;
			}
			insert(parent.left, t);
		}
		
		if(t.node.compareTo(parent.node) >= 0){
			if (parent.right == null){
				parent.right = t;
				return;
			}
			insert(parent.right, t);
		}
	}
	
	public void add(String x){
		TNode t1 = new TNode(x);
		if (this.root == null){
			this.root = t1;
			return;
		}
		else insert(this.root, t1);
	}
	
	//Infix
	private void printNodeinfix(TNode t){
		if (t.left != null){
			printNodeinfix(t.left);
		}
		System.out.print(t.node + " ");
		if (t.right != null){
			printNodeinfix(t.right);
		}
	}
	
	public void printInfix(){
		printNodeinfix(this.root);
		System.out.println();
	}
	
	//Postfix
	private void printNodepostfix(TNode t){
		if (t.left != null){
			printNodepostfix(t.left);
		}
		if (t.right != null){
			printNodepostfix(t.right);
		}
		System.out.print(t.node + " ");
	}
	
	public void printPostfix(){
		printNodepostfix(this.root);
		System.out.println();
	}
	
	//Prefix
	private void printNodeprefix(TNode t){
		System.out.print("(" + t.node + ") ");
		if (t.left != null){
			printNodeprefix(t.left);
		}
		if (t.right != null){
			printNodeprefix(t.right);
		}
	}
	
	public void printPrefix(){
		printNodeprefix(this.root);
		System.out.println();
	}
	
	//Reverse
	private void printNodereverse(TNode t){
		if (t.right != null){
			printNodereverse(t.right);
		}
		System.out.print("(" + t.node + ") ");
		if (t.left != null){
			printNodereverse(t.left);
		}
	}
	
	public void printReverse(){
		printNodereverse(this.root);
		System.out.println();
	}
	
	//count of nodes
	private int count(TNode t){
		if (t == null){
			return 0;
		}
		return count(t.left) + 1 + count(t.right);
	}
	
	public int count(){
		return count(this.root);
	}
	
	//depth of the tree
	private int depth(TNode t){
		if (t == null){
			return 0;
		}
		int d = Math.max(depth(t.left), depth(t.right));
		return d + 1;
	}
	
	public int depth(){
		return depth(this.root);
	}
	
	//create a tree branch - this can be an expression tree
	public TNode createBranch(String value, TNode left, TNode right){
		TNode t = new TNode (value);
		t.left = left;
		t.right = right;
		
		return t;
	}
	
	
	

}
