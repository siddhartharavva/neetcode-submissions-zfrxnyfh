class MinStack {
    Stack <Integer> st;
    Stack <Integer> min;
    public MinStack() {
        st = new Stack<>();    
        min = new Stack<>();    
    }
    
    public void push(int val) {
        st.push(val);
        if(min.isEmpty() || val<=min.peek())min.push(val);
    }
    
    public void pop() {    
        if(st.isEmpty())return;    
        int removed = st.pop();
        if(removed==min.peek())min.pop();

    }
    
    public int top() {
        return st.peek();
    }
    
    public int getMin() {
        return min.peek();
    }
}



/*
class MinStack {
    private Stack<Integer> stack;
    private Stack<Integer> minStack;

    public MinStack() {
        stack = new Stack<>();
        minStack = new Stack<>();    
        
    }
    
    public void push(int val) {
        stack.push(val);
        if(minStack.isEmpty() || minStack.peek()>=val){
            minStack.push(val);
            
        }
    }
    
    public void pop() {        
        if(stack.isEmpty())return;
        int removed = stack.pop();
        if(removed==minStack.peek())minStack.pop();

    }
    
    public int top() {
        return stack.peek();
    }
    
    public int getMin() {        
        return minStack.peek();
        
    }
}



*/

