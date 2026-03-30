class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> output = new ArrayList<>();
        List<HashMap<Character, Integer>> list = new ArrayList<>();
        List <String> strss = new ArrayList<>();   
        for(String i : strs){
            int il = i.length();
            HashMap<Character, Integer> temph = new HashMap<>();
            for(int j = 0 ; j < il ; j++){
                Character tempch = i.charAt(j);
                temph.put(tempch,temph.getOrDefault(tempch,0)+1);
            }
            strss.add(i);
            list.add(temph);
        }
        while(list.size()!=0){
            List<String> tempL = new ArrayList<>();
            for (int i = 1; i < list.size(); i++) {
               if (list.get(0).equals(list.get(i)) ) {
                    tempL.add(strss.get(i));
                    strss.remove(i);
                    list.remove(i);
                    i--;
                }      
            }
            tempL.add(strss.get(0));
            strss.remove(0);
            list.remove(0);   
            output.add(tempL);                      
        }        
        return output;
    }
    
}
