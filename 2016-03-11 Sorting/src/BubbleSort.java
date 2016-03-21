
public class BubbleSort {
	
	public static int[] sort(int[] list) {
		for (int x = 0; x < list.length; x ++){
			for (int y = x + 1; y < list.length; y++){
				if (list[x] > list[y]){
					int temp = list[x];
					list[x] = list[y];
					list[y] = temp;
				}
			}
		}
		return list;
	}
	
	
	public static int[] sort2(int[] list) {
		int swapcount;
		do {
			swapcount = 0;
			for (int ix = 0; ix < list.length - 1; ix++){
				if (list[ix] > list[ix + 1]){
					int temp = list[ix];
					list[ix] = list[ix + 1];
					list[ix + 1] = temp;
					swapcount++;
				}
			}
		} while (swapcount > 0);
		return list;
	}
	
	
}
