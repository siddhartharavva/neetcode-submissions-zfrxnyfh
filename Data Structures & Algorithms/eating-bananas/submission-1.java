class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int l = 1;
        int r = 0;
        for(int i : piles)r = Math.max(r,i);
        int ans = r;        
        while(l<=r){
            int temp = 0;
            int mid =l+(r-l)/2;
            for(int b : piles){
                temp += (b+mid-1)/mid;
            }
            if (temp<=h){
                ans = mid;
                r = mid-1;
            }else {
                l = mid+1;
            }
        }
        return ans;
    }
}


























/*class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int l = 1;
        int r = 0;
        for (int p : piles) r = Math.max(r, p);
        int ans = r;
        while (l <= r) {
            int k = l + (r - l) / 2;
            int hours = 0;
            for (int p : piles) {
                hours += (p + k - 1) / k;  
            }
            if (hours <= h) {
                ans = k;      
                r = k - 1;
            } else {
                l = k + 1;    
            }
        }

        return ans;
    }
}*/