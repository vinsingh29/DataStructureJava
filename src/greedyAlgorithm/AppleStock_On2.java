package greedyAlgorithm;

public class AppleStock_On2 {

	public static int getMaxProfit(int[] stockPrices) {

		int maxProfit = 0;

		for (int outerTime = 0; outerTime < stockPrices.length; outerTime++) {

			for (int innerTime = 0; innerTime < stockPrices.length; innerTime++) {

				int earlierTime = Math.min(outerTime, innerTime);
				int laterTime = Math.max(outerTime, innerTime);

				int earlierPrice = stockPrices[earlierTime];
				int laterPrice = stockPrices[laterTime];

				int potentialProfit = laterPrice - earlierPrice;

				maxProfit = Math.max(maxProfit, potentialProfit);
			}
		}

		return maxProfit;
	}

	public static void main(String[] args) {
		int[] appleStock = new int[] { 1, 5, 3, 2 };
		System.out.println("Maximum Profit : " + getMaxProfit(appleStock));

	}

}
