
public class MergeSort {
	
	public static int[] sort(int[] a, int[] b) {
		SimpleSort.sort(a);
		SimpleSort.sort(b);
		int alen = a.length;
		int blen = b.length;
		int count = 0;
		int[] result = new int [alen+blen];
		
		int ax = 0;
		int bx = 0;
		
		while (ax < alen || bx < blen) {
			while (ax < alen && (bx == blen || a[ax] <= b[bx])) {
				result[count++] = a[ax++];
			}
			while (bx < blen && (ax == alen || b[bx] <= a[ax])) {
				result[count++] = b[bx++];
			}
		}
		return result;
	}

}
