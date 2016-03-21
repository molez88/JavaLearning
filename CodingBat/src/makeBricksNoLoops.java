
public class makeBricksNoLoops {
	
	public static boolean makeBricks(int small, int big, int goal) {
		
		boolean result = false;
		int factorof5 = goal / 5;
		int goalmod5 = goal % 5;
		
		if ((big * 5) + small < goal){
			result = false;
		}
		
		else if ((big * 5) + small == goal){
			result = true;
		}
		
		else if ((big * 5) + small > goal){
			
			if (factorof5 < big){
				int partial = factorof5 * 5;
				
		        if (small < goal - partial){
		        	result = false;
		          }
		          else { 
		        	  result = true;
		          }
		     }
			
			if (factorof5 > big){
				int partial = big * 5;
				
		        if (small < goal - partial){
		        	result = false;
		          }
		          else { 
		        	  result = true;
		          }
		     }
		}
		System.out.println(result);
		return result;
	}
	
	public static void main(String[] args) {
		makeBricks(5, 5, 25);
		makeBricks(3, 1, 8);
		makeBricks(3, 3, 12);
		makeBricks(3, 5, 19);
		
	}


}
