package strings;

public class ReverseWords {

	public static void revMessage(char[] message) {
		revWords(message, 0, message.length - 1);
		int currentWordStartIndex = 0;

		for (int i = 0; i <= message.length; i++) {

			if (i == message.length || message[i] == ' ') {

				revWords(message, currentWordStartIndex, i - 1);
				currentWordStartIndex = i + 1;

			}
		}

	}

	@SuppressWarnings("null")
	public static void revWords(char[] charStr, int firstIndex, int lastIndex) {

		if (charStr == null)

			if (charStr.length == 0)
				throw new IllegalArgumentException("Please enter a String");

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
		char[] message = { 'c', 'a', 'k', 'e', ' ', 'p', 'o', 'u', 'n', 'd', ' ', 's', 't', 'e', 'a', 'l' };

		revMessage(message);
		System.out.println(message);

	}

}
