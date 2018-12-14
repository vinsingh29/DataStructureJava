package strings;

import java.util.*;

public class PalindromePermutationsChecker {

	public static boolean isPalindromePermutation(String str) {

		Set<Character> s = new HashSet<Character>();

		for (char c : str.toCharArray()) {
			if (s.contains(c)) {
				s.remove(c);

			} else {

				s.add(c);
			}

		}

		return s.size() <= 1;

	}

}
