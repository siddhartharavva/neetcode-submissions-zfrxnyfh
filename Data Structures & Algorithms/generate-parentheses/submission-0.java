class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> ans = new ArrayList<>();
        bt(ans, "", 0, 0, n);
        return ans;        
    }
    private void bt(List<String> ans , String curr,int op,int cl,int n){
        if(curr.length()==2*n){
            ans.add(curr);
            return;
        }

        if(op<n){
            bt(ans, curr+"(", op+1, cl, n);
        }


        if(cl<op){
            bt(ans, curr+")", op, cl+1, n);
        }
    }

}
