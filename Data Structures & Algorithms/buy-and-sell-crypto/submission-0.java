class Solution {
    public int maxProfit(int[] prices) {
        if(prices.length == 1 || prices.length == 0){
            return 0;
        }
        int result = 0 ;
        int left = 0;
        int right = 1;
        while(right < prices.length){
            if(prices[right] > prices[left]){
                result = Math.max(result , prices[right] - prices[left]);
            } else {
                left = right;
            }
            right++;
        }
        return result;
    }
}
