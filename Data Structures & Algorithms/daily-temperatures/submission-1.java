class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        int [] res = new int[temperatures.length];
        Stack <Integer> st = new Stack<>();
        for(int i =0;i < temperatures.length;i++){
            while(!st.isEmpty() && temperatures[st.peek()]<temperatures[i]){
                int prev = st.pop();
                res[prev] = i - prev; 
            }        
            st.push(i);           
        }
        return res;
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