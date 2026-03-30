class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        Stack <Integer> st = new Stack<>();
        int [] ans = new int [temperatures.length];
        for(int i = 0; i <  temperatures.length ;i++){
            while(!st.isEmpty() && temperatures[i]>temperatures[st.peek()]){
                ans[st.peek()]=i-st.pop();
            }
            st.push(i);
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