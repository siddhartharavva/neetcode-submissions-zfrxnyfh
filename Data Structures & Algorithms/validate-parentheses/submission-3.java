class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        if(s.length()%2!=0)return false;
        for(char sc : s.toCharArray()){
            if(sc=='(')stack.push(')');
            else if(sc=='{')stack.push('}');
            else if(sc=='[')stack.push(']');
            else if(!stack.isEmpty() && sc==stack.peek() )stack.pop();
            else return false;
        }
        return stack.isEmpty();

    }
}
