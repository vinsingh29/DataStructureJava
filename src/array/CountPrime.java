package array;

public class CountPrime {

	public static int countPrimes(int n) {

		int count = 0;

		for (int i = 1; i <= n; i++) {
			if (isPrime(i)) {
				count++;
				System.out.println(i);
			}
		}
		return count;
	}

	public static boolean isPrime(int n) {

		if (n < 2)
			return false;
		else {
			for (int i = 2; i < (Math.sqrt(n)) + 1; i++) {
				if (n % i == 0 && i != n) {
					return false;
				}
			}
		}
		return true;

	}

	public static void main(String[] args) {

		System.out.println(countPrimes(10));

	}

}
