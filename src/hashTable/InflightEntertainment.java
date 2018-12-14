package hashTable;

import java.util.HashSet;
import java.util.Set;

public class InflightEntertainment {

	public static boolean inFlight(int flightLength, int[] movieLengths) {

		Set<Integer> movieLengthsSeen = new HashSet<>();

		for (int firstMovieLength : movieLengths) {

			int matchingSecondMovieLength = flightLength - firstMovieLength;
			if (movieLengthsSeen.contains(matchingSecondMovieLength)) {
				return true;
			}

			movieLengthsSeen.add(firstMovieLength);
		}

		return false;
	}

	public static void main(String[] args) {
		int[] movieLen = { 3, 4, 5 };
		System.out.println(inFlight(7, movieLen));

	}

}
