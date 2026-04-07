class Solution {
    public int maxProfit(int[] prices) {
        int l = 0;
        int n = prices.length;
        int r = 1;
        int max = 0;
        while(r<n){
            if(prices[l]>prices[r])l = r;
            else{
                max = Math.max(max,prices[r]-prices[l]);
            }
            r++;
        }
        return max;
    }
}

























/*class Solution {
    public int maxProfit(int[] prices) {
     int l = 0;
     int r = 1;
     int n = prices.length;
     int maxprice = 0;
     while(r<n){
        if(prices[l]>prices[r]){            
            l = r;            
        }else{
            maxprice = Math.max(maxprice,prices[r]-prices[l]);
        }
        r++;
     }   
    return maxprice;
    }
    
}
*/