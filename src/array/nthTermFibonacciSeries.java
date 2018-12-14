package array;

public class nthTermFibonacciSeries {

	public static int fib(int n) {

		int t = 0;
		int f = 0, s = 1;

		for (int i = 2; i <= n; i++) {
			System.out.print(t);
			t = f + s;
			f = s;
			s = t;
			System.out.println();

		}
		return t;
	}

	public static void main(String[] args) {

		System.out.println(fib(5));

	}

}
