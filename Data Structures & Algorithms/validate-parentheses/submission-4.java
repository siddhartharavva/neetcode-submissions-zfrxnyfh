class Solution {
    public boolean isValid(String s) {
        Stack <Character> val = new Stack<>();
        for(char i : s.toCharArray()){
            if(i=='[')val.push(']');
            else if(i=='{')val.push('}');
            else if(i=='(') val.push(')');
            else if(val.isEmpty() || val.pop()!=i)return false;
        
        }
        return val.isEmpty();
      














        
        
        
        
        
        
        
        
        /*Stack<Character> stack = new Stack<>();
        if(s.length()%2!=0)return false;
        for(char sc : s.toCharArray()){
            if(sc=='(')stack.push(')');
            else if(sc=='{')stack.push('}');
            else if(sc=='[')stack.push(']');
            else if(!stack.isEmpty() && sc==stack.peek() )stack.pop();
            else return false;
        }
        return stack.isEmpty();
        */
    }
}
