class Solution {
    public int largestRectangleArea(int[] heights) {
        Stack <Integer> st = new Stack<>();
        int max = 0;
        int n = heights.length;
        for(int i = 0;i <= n ;i++){
            int ch = (i==n) ?  0 : heights[i];
            
            while(!st.isEmpty() && ch<heights[st.peek()]){
                int h = heights[st.pop()];
                int r = i;
                int l = st.isEmpty() ? -1 : st.peek();
                max = Math.max(max,h*(r-l-1));
                
            }

            st.push(i);
            
        }
        return max;
    }
}




















/* class Solution {
    public int largestRectangleArea(int[] heights) {    
        Stack <Integer> stack = new Stack<>();
        int max = 0;
        int n = heights.length;
        for(int i = 0 ; i <= n ; i++){
            int ch = (i==n) ? 0 : heights[i];
            while(!stack.isEmpty() && ch < heights[stack.peek()]){
                int h = heights[stack.pop()];
                int r = i;
                int l = stack.isEmpty() ? -1 : stack.peek();
                max = Math.max(max,h*(r-l-1));
            }
            stack.push(i);
        }
        return max;
    }
}
 */
