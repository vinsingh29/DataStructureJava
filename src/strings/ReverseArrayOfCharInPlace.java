package strings;

import java.util.Arrays;

public class ReverseArrayOfCharInPlace {

	@SuppressWarnings("null")
	public static void revString(char[] charStr) {

		if (charStr == null)

			if (charStr.length == 0)
				throw new IllegalArgumentException("Please enter a String");

		int firstIndex = 0;
		int lastIndex = charStr.length - 1;

		while (firstIndex < lastIndex) {
			char temp;
			temp = charStr[firstIndex];
			charStr[firstIndex] = charStr[lastIndex];
			charStr[lastIndex] = temp;
			firstIndex++;
			lastIndex--;

		}

	}

	public static void main(String[] args) {
		//char[] message = { 'H', 'I' };

		  char[] message = { 'c', 'a', 'k', 'e', ' ',
		                   'p', 'o', 'u', 'n', 'd', ' ',
		                   's', 't', 'e', 'a', 'l' };
		revString(message);
		System.out.println("Reversed Message :" + Arrays.toString(message));

	}

}
