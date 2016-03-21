
public class Shapes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MyShape s1 = new MyShape("Triangle", 3);
		MyShape s2 = new MyShape("Quadrilateral", 4);
		MyShape s3 = new MyShape("Sqaure", 4);
		MyShape s4 = new MyShape("Star", 10);
		MyShape sp1 = new MyShape(4);
		MyShape sp2 = new MyShape(10);
		MyShape sp3 = new MyShape(2);
		Triangle t1 = new Triangle();
		Quadrilateral q1 = new Quadrilateral();
		Rectangle r1 = new Rectangle();
		
		s1.printinfo();		//printinfo is calling method on the object
		t1.printinfo();
		
		s3.printinfo();
		q1.printinfo();
		r1.printinfo();
		
		sp1.printinfo();
		sp2.printinfo();
		sp3.printinfo();
		
		String x = s1.Def; //Def is static class variable
		System.out.println(x);

		System.out.println(s1.vertices); // vertices is a public class variable (not static)
		//static is calling method on the class
	}

}
