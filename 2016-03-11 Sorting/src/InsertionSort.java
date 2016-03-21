
public class InsertionSort {
	
	
	private static void insert(int value, int[] list2){
		int loc = -1;
		for (int x = 0; x < list2.length; x++){
			if (list2[x] > value){
				loc = x;
				break;
			}
		}
		if (loc == -1){
			loc = 0;
		}
		for (int x = list2.length - 1; x > loc; x--){
			list2[x] = list2[x-1];
		}
		if (loc == 0){
			list2[0] = value;
			return;
		}
		list2[loc] = value;
	}
	
	
	public static int[] sort(int[] list) {
		int[] list2 = new int[list.length];
		for (int x = 0; x < list.length; x++){
			insert(list[x], list2);
		}
		return list2;
	}
	
	

}
