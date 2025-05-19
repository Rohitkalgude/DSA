package Day5;

public class Buyorsell {
    public int maximumProfit(int prices[]) {
        int min = prices[0];
        int maxProfit = 0;

        for (int i = 1; i < prices.length; i++) {
            if (prices[i] < min) {
                min = prices[i];
            }
            int profit = prices[i] - min;
            if (profit > maxProfit) {
                maxProfit = profit;
            }
        }
        return maxProfit;
    }

    public static void main(String[] args) {
        int[] prices = {7, 10, 1, 3, 6, 9, 2};
        Buyorsell sol = new Buyorsell();
        System.out.println(sol.maximumProfit(prices));  // Output: 8
    }
}
