
public class SortMethods {
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] file = {9, 3, 7, 2, 8, 5, 4, 6, 1};
		int[] file2 = {9, 13, 6, 12, 4, 3, 9, 2, 10};
		
		//int[] fileprint = SimpleSort.sort(file);
		
		//int[] inserttrial = InsertionSort.sort(file);
		
		int[] bubbleprint = BubbleSort.sort2(file);
		
		int[] mergeprint = MergeSort.sort(file, file2);
		
		for (int x = 0; x < mergeprint.length; x++){
			System.out.print(mergeprint[x] + " ");
		}
		System.out.println();
		
		int[] nums = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20};
		
		int value = 40;
		int dex = BinarySearch.search(nums, value);
		
		
		System.out.println("Index of " + value + " is: " + dex);
	}

}
