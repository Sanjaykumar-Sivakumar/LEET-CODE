class Solution {
    public int maxProfit(int[] prices) {
        int profit = 0;
        int by = Integer.MAX_VALUE;
        int temp =0;
        for(int p : prices)
        {
            if(by>p)
            {
                by = p;
            }
            else
            {
             temp = p - by; 
            if(profit<temp)
            {
                profit = temp;
            }
            }
        }
        return profit;
    }
}