public class BestTimeToBuyAndSellStocks {
    public int maxProfit(int[] prices) {
        int ans=0, curr= prices[0];
        for(int i=1; i<prices.length; i++){
            ans= Math.max(ans,prices[i]-curr);

            if(curr>prices[i])
                curr= prices[i];
        }

        return ans;
    }
}
