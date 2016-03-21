import java.util.Arrays;

public class SimpleSort {
	
	public static int[] sort(int[] list) {
		int count = 0;
		for (int x = 0; x < list.length; x++){
			int minx = x;
			for (int y = x + 1; y < list.length; y++){
				count++;
				if (list[minx] > list[y]){
					minx = y;
				}
			}
			if (x != minx){
				int temp = list[x];
				list[x] = list[minx];
				list[minx] = temp;
			}	
		}
		System.out.println("The number of comparisons is: " + count);
		return list;
	}
	
	
	
}
