class Solution {
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














        /*Stack<Integer> stack = new Stack<>();
        int maxArea = 0;
        int n = heights.length;

        for (int i = 0; i <= n; i++) {
            int currHeight = (i == n) ? 0 : heights[i];

            while (!stack.isEmpty() && currHeight < heights[stack.peek()]) {
                int height = heights[stack.pop()];
                int right = i;
                int left = stack.isEmpty() ? -1 : stack.peek();
                int width = right - left - 1;
                maxArea = Math.max(maxArea, height * width);
            }

            stack.push(i);
        }

        return maxArea;        
    }
}*/
