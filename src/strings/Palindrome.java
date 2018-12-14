package strings;

public class Palindrome {

	public static boolean isPalindrome(String s) {

		boolean checkPalindrome = false;
		int low = 0;
		int high = s.length() - 1;

		while (low < high) {

			if (s.toLowerCase().charAt(low) == s.toLowerCase().charAt(high)) {
				checkPalindrome = true;
				low++;
				high--;

			} else {
				checkPalindrome = false;
				break;
			}
		}
		return checkPalindrome;
	}

	public static void main(String[] args) {
		System.out.println(isPalindrome("aabcbcd"));

	}

}
