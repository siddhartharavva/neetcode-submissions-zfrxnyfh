class Solution {

    public String encode(List<String> strs) {
        StringBuilder sb = new StringBuilder();
        for(String i : strs){
            sb.append(i);
            sb.append("\0");
        }
        return sb.toString();
    }

    public List<String> decode(String str) {        
        List<String> ans = new ArrayList<>();
        StringBuilder sb = new StringBuilder();
        for(char ch: str.toCharArray()){            
            if(ch!='\0'){
                sb.append(ch);
            }else{
                ans.add(sb.toString());
                sb = new StringBuilder();

            }        
        }
        return ans;
    }
}
