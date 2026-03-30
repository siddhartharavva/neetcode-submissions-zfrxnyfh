class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        int [] ans = new int [temperatures.length];
        Stack <Integer> min = new Stack<>();
        for(int i = 0 ; i < temperatures.length;i++){
            while(!min.isEmpty() && temperatures[i]>temperatures[min.peek()]){
                ans[min.peek()]= i-min.pop();
            }
            min.push(i);
        }
        return ans;
    }
}
























/*class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        int [] res = new int[temperatures.length];
        Stack <Integer> vals = new Stack<>();
        
        for(int t = 0;t < temperatures.length;t++){            
            while(!vals.isEmpty() && temperatures[vals.peek()]<temperatures[t]){
                int prev = vals.pop();
                res[prev] = t - prev;            
            }
            vals.push(t);
            }        
        return res;
    }
}
*/