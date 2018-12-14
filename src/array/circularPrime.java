package array;
/* Added Comment */

public class circularPrime {

	public static boolean isCircularPrime(int num) {

		boolean isCircurlarPrime = true;
		int a = num;

		do {
		if (isPrime(num) == true) {
			isCircurlarPrime = true;
			a = circulate(a);
			
		} else {
			isCircurlarPrime = false;
			break;
		}
		}while(a != num);

		return isCircurlarPrime;
	}

	private static int circulate(int a) {
		
		String s = Integer.toString(a);
		String concatString = s.substring(1) + s.charAt(0);
		int res = Integer.parseInt(concatString);
		
		return res;
	}

	private static boolean isPrime(int num) {

		int i;
		boolean isPrime = true;
		for (i = 2; i <= Math.sqrt(num); i++) {
			if (num % i == 0) {
				isPrime = false;
				break;
			} else {
				isPrime = true;

			}

		}

		return isPrime;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		for(int i = 1150 ; i <= 2000 ; i++) {
			if(isCircularPrime(i)) {
				System.out.println(i);
			}
			
		}
		
		System.out.println(isCircularPrime(79));

		
	}

}
