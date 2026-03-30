class Solution {
    public boolean isAnagram(String s, String t) {
        HashMap <Character,Integer> count = new HashMap<>();
        int sn = s.length();
        int tn = t.length();
        if(sn!=tn)return false;
        for(int i = 0; i<sn;i++){
            char sc = s.charAt(i);
            count.put(sc,count.getOrDefault(sc,0)+1);
        }
        for(int i = 0 ;i<tn;i++){
            char tc = t.charAt(i);
            if(count.containsKey(tc) && count.get(tc)!=0)count.put(tc,count.get(tc)-1);
            else return false;
        }
        return true;
    }
}
