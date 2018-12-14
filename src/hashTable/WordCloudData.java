package hashTable;

import java.util.HashMap;


public class WordCloudData {

	private void populateWordsToCounts(String inputString) {

		// count the frequency of each word
		HashMap<String, Integer> countStringMap = new HashMap<String, Integer>();

		String[] words = inputString.toLowerCase().split(" ");

		for (int i = 0; i < words.length; i++) {

			if (countStringMap.containsKey(words[i])) {

				int value = countStringMap.get(words[i]);
				countStringMap.put(words[i], value + 1);

			} else {

				countStringMap.put(words[i], 1);
			}

		}
		
		System.out.println(countStringMap);

	}

	public static void main(String[] args) {
		String text = "Chocolate cake for dinner and pound cake for dessert.";
		WordCloudData wc = new WordCloudData();
		wc.populateWordsToCounts(text);

	}

}
