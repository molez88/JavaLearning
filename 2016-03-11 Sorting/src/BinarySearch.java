
public class BinarySearch {

	public static int search(int[] list, int element) {
		int index = -1;
		int lo = 0;
		int hi = list.length - 1;
		
		while (true) {
			if (list[lo] == element) {
				return lo;
			}
			if (list[hi] == element){
				return hi;
			}
			if (lo == hi || element < list[lo] || element > list[hi]) {
				break;
			}
			int mid = (hi + lo + 1) / 2;
			
			if (element < list[mid]){
				hi = mid;
			}
			else if (element >= list[mid]){
				lo = mid;
			}
		}
		return -1;
	}
	
}
