class Solution {
    public List<String> letterCombinations(String digits) {
        List <String> ans = new ArrayList<>();
        if (digits.length() == 0) return ans;
        String [] vals = new String[]{"abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
        String curr = "";
        String [] send = new String[digits.length()];
        bt(digits,0,"",ans,vals);
        return ans;
    }
    private void bt(String digits, int idx, String curr, List<String> ans, String[] map) {
        if(idx==digits.length()){
            ans.add(curr);
            return;
        }
        String letters = map[digits.charAt(idx) - '2'];
        for (char c : letters.toCharArray()) {
            bt(digits, idx + 1, curr + c, ans, map);
        }    
    }
}
