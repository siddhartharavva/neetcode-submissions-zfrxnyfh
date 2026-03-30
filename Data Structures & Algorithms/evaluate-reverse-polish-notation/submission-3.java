class Solution {
    public int evalRPN(String[] tokens) {
        Stack <Integer> st = new Stack<>();        
        for(String i : tokens){
            if(i.equals("+")) st.push(st.pop()+st.pop());
            else if(i.equals("*"))st.push(st.pop()*st.pop());
            else if(i.equals("-")){                
                st.push(-(st.pop()-st.pop()));
            }
            else if(i.equals("/")){
                int a = st.pop();
                st.push(st.pop()/a);
            }else st.push(Integer.parseInt(i));            
        }
        return st.pop();
    }
}


/*class Solution {
    public int evalRPN(String[] tokens) {
        Stack <Integer> stack = new Stack<>();
        for (String token : tokens) {
            if (token.equals("+")) {
                stack.push(stack.pop() + stack.pop());
            } 
            else if (token.equals("*")) {
                stack.push(stack.pop() * stack.pop());
            } 
            else if (token.equals("-")) {
                int b = stack.pop();                
                stack.push(stack.pop() - b);
            } 
            else if (token.equals("/")) {
                int b = stack.pop();            
                stack.push(stack.pop()/ b);
            } 
            else {
                stack.push(Integer.parseInt(token));
            }
        }

        return stack.pop();
    }
}
*/