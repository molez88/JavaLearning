
public class Array1_problems_2016_03_01 {
	
	public static int[] maxEnd (int[] xx){
		
		if (xx.length != 3){
			return null;
		}
		
		int max = Math.max(xx[0], xx[2]);
		
		xx[0] = max;
		xx[1] = max;
		xx[2] = max;
		
		return xx;
		
	}
	
	
	public static int[] midThree (int[] xx){
		
		int length = xx.length;
		int[] result = new int [3];
		
		if (length % 2 == 0){
			return null;
		}
		
		if (length == 1){
			result[0] = xx[0];
			result[1] = xx[0];
			result[2] = xx[0];
		}
		
		int mid3 = length/2;
		
		result[0] = xx[mid3 - 1];
		result[1] = xx[mid3];
		result[2] = xx[mid3 + 1];
		
		return result;
		
	}
	
	
	public static int[] plusTwo (int[] aa, int[] bb){
		
		if (aa.length !=2 || bb.length != 2){
			return null;
		}
		
		int[] result = new int [4];
		result[0] = aa[0];
		result[1] = aa[1];
		result[2] = bb[0];
		result[3] = bb[1];
		
		return result;
		
	}
	
	public static void printArray(int[] aa){
		
		if (aa == null){
			System.out.println("The size of the given array is incorrect.");
			return;
		}
		for (int x : aa){
			System.out.print(x + " ");
		}
		System.out.println();
	}

	public static void main(String[] args) {
		int[] aa = {1,3,5};
		int[] bb = {5,3,4};
		int[] cc = {4,7,5};
		int[] dd = {1,3};
		int[] ee = {5,7};
		int[] ff = {1,3,5,6,7,2,3,2,9};
		int[] gg = {1};
		int[] hh = {1,6,7,5};
		int[] ii = {1,3,5};
		
		int [] result1 = maxEnd(aa);
		int [] result2 = plusTwo(ee,dd);
		int [] result3 = midThree(hh);
		
		printArray(result1);
		
		printArray(result3);
		printArray(result2);
		
	}

}
