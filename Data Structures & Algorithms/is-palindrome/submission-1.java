class Solution {
    public boolean isPalindrome(String s) {           
        String cleaned = s.toLowerCase().replaceAll("[^a-z0-9]", "");
        System.out.println(cleaned);
        int l = 0;
        int r = cleaned.length()-1;     
        while(l<r){            
            if(cleaned.charAt(l)!=cleaned.charAt(r))return false;
            r--;
            l++;

        }
        return true;
    }
}
