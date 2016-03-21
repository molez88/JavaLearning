
public class Fibonacci {

	public static void main(String[] args) {
/*
		int curfib = 1;
		int prevfib1 = 1;
		int prevfib2 = 1;
		System.out.print("1 1 ");
		for (curfib = 1; ; ) {
			if (curfib > 2000)
				break;
			curfib = prevfib1 + prevfib2;
			System.out.print(curfib + " ");
			prevfib2 = prevfib1;
			prevfib1 = curfib;
		}
	*/
		int prev = 0;
		int cur = 1;
		while (cur < 2000) {
			System.out.print(cur + " ");
			int temp = prev;
			prev = cur;
			cur = cur + temp;
		}
	}

}
