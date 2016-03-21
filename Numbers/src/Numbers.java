
public class Numbers {

	public static void main(String[] args) {
		double cost; //cost of one apple
		cost = 0.88;
		System.out.println("The cost of one apple is $" + cost);
		double cost15; //the cost of 15 apples
		cost15 = cost*15;
		System.out.println("The cost of 15 apples is $" + cost15);
		System.out.println("The cost of 20 apples is $" + cost*20);
		System.out.println("The cost of 20 apples is $" + (cost15 + cost*5));
		
		double cost20 = cost*20;
		System.out.println(cost20);

	}

}
