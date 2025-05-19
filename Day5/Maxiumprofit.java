package Day5;

public class Maxiumprofit {
    public static int maxprofit(int prices[]) {
        int n = prices.length;
        int profit = 0;

        for(int i=1; i<n; i++){
            if(prices[i] > prices[i-1]){
                profit = profit + prices[i] - prices[i-1];
            }
        }

        return profit;
    }

    public static void main(String[] args) {
        int arr[] = {100, 180, 260, 310, 40, 535, 695};
        int result = maxprofit(arr);
        System.out.println("profit"+ result);
    }
}
