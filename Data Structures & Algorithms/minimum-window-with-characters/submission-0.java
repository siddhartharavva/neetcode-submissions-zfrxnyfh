class Solution {
    public String minWindow(String s, String t) {
        if (s.length() == 0 || t.length() == 0) return "";
        HashMap<Character, Integer> need = new HashMap<>();
        HashMap<Character, Integer> window = new HashMap<>();
        // Build need map
        for (char c : t.toCharArray())need.put(c, need.getOrDefault(c, 0) + 1);
        
        int required = need.size();
        int formed = 0;
        int l = 0, r = 0;
        int minLen = Integer.MAX_VALUE;
        int minStart = 0;

        while (r < s.length()) {

            char c = s.charAt(r);

            window.put(c, window.getOrDefault(c, 0) + 1);

            // Check if requirement satisfied
            if (need.containsKey(c) &&
                window.get(c).intValue() == need.get(c).intValue()) {
                formed++;
            }

            // Try shrinking window
            while (l <= r && formed == required) {

                if (r - l + 1 < minLen) {
                    minLen = r - l + 1;
                    minStart = l;
                }

                char leftChar = s.charAt(l);

                window.put(leftChar, window.get(leftChar) - 1);

                if (need.containsKey(leftChar) &&
                    window.get(leftChar) < need.get(leftChar)) {
                    formed--;
                }

                l++;
            }

            r++;
        }

        return minLen == Integer.MAX_VALUE
            ? ""
            : s.substring(minStart, minStart + minLen);
    }
}