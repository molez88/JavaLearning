import javax.naming.spi.DirStateFactory.Result;

public class MyShape{
	String name;
	int vertices;
	public static String Def = "The definition of a shape is :";
	
	public MyShape(String name, int vertices){		
		//when name of method is the same as the name of the class, it is a constructor
		//a constructor is when you are creating an object out of the class definition
		this.name = capname(name);
		this.vertices = vertices;	
	}
	
	
	public MyShape(int vx){
		vertices = vx;
		/*
		if (vx == 3) name = "triangle";
		else if (vx == 4) name = "quadrilateral";
		else if (vx == 5) name = "pentagon";
		else if (vx == 6) name = "hexagon";
		else if (vx == 8) name = "octagon";
		else name = "polygon";
		*/
		//instead of listing else if statements, call switch
		//switch/case can only take constant arguments, must use
		//if/else if to use variable arguments (x >= y)
		switch (vx) {
		case 1:
			name = "point";
			break;
		case 2: 
			name = "line";
			break;
		case 3: 
			name = "triangle";
			break;
		case 4: 
			name = "quadrilateral";
			break;
		case 5: 
			name = "pentagon";
			break;
		case 6: 
			name = "hexagon";
			break;
		case 8: 
			name = "octagon";
			break;
		default:
			if (vx < 1){
				name = "not a shape";
			}
			else name = "polygon";
			break;
		}
		
	}
	
	String capname(String nm){
		String result = nm.toUpperCase();
		return result;
	}
	public void printinfo(){
		System.out.println("This is a " + name + " with " + vertices + " number of vertices.");
	}
	
	public static String info(){
		return "This is a shape.";
	}
}

