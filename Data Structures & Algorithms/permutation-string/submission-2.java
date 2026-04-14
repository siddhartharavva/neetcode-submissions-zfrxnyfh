class Solution {
    public boolean checkInclusion(String s1, String s2) {
        if(s2.length()<s1.length())return false;
        int [] cs1 = new int[26];
        int [] cs2 = new int[26];        
        for(Character s : s1.toCharArray())cs1[s-'a']++;
        int k = s1.length();
        for(int r = 0 ; r < s2.length();r++){
            cs2[s2.charAt(r)-'a']++;
            if(r>=k)cs2[s2.charAt(r-k)-'a']--;
            if(Arrays.equals(cs2,cs1))return true;

        }
        return false;

        
    }
}



























/*class Solution {
    public boolean checkInclusion(String s1, String s2) {
        if(s2.length()<s1.length())return false ;
        int [] cs1 = new int[26];
        int [] cs2 = new int[26];
        for(char c1:s1.toCharArray()){
            cs1[c1-'a']++;
        }
        int k = s1.length();
        for(int i = 0 ; i < s2.length();i++){
            cs2[s2.charAt(i)-'a']++;
            if(i>=k){
                cs2[s2.charAt(i-k)-'a']--;
            }
            if (Arrays.equals(cs1, cs2))return true;
            
        }
        return false;


        
    }
}
*/