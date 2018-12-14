package hashTable;

import java.util.HashMap;
import java.util.Map;

public class countingAlgorithm {
	
	public static void count(int[] theArray) {
		
		  Map<Integer, Integer> counts = new HashMap<>();

		  for (int item : theArray) {
		      Integer count = counts.get(item);
		      int incrementedCount = (count == null) ? 1 : count + 1;
		      counts.put(item, incrementedCount);
		  }
		System.out.println(counts);
		
	}

	public static void main(String[] args) {
		int[] input = {1,2,3,2,4,5,6,7,3,4,5,6};
		
		count(input);

	}

}
