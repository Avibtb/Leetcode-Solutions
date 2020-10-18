class Solution {
    public int maxProfit(int k, int[] prices) {
        int size = prices.length;
        int maxProfit = 0;
        if (k >= size / 2){
            for (int i = 1; i < size; ++i){
                maxProfit += Math.max(0, prices[i] - prices[i - 1]);
            }
            return maxProfit;
        }
        int[] hold = new int[k + 1];
        int[] sold = new int[k + 1];
        Arrays.fill(hold, Integer.MIN_VALUE / 2);
        Arrays.fill(sold, Integer.MIN_VALUE / 2);
        hold[0] = 0;
        sold[0] = 0;
        for (int i = 0; i < size; ++i){
            int[] hold_old = hold.clone();
            int[] sold_old = sold.clone();
            for (int j = 1; j <= k; ++j){
                hold[j] = Math.max(hold_old[j], sold_old[j - 1] - prices[i]);
                sold[j] = Math.max(sold_old[j], hold_old[j] + prices[i]);
            }
        }
        for (int num : sold){
            maxProfit = Math.max(num, maxProfit);
        }
        return maxProfit;
    }
}