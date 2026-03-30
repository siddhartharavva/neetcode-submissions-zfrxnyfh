class Solution {
    public boolean makeEqual(String[] words) {
        int []  co = new int [26];
        for(String i : words){
            for(char c : i.toCharArray()){
                co[c-'a']+=1;
            }
        }
        int n = words.length;

        for(int c : co){
            if(c % n != 0){
                return false;
            }
        }

        return true;
    }
    private void ar(int []a){
        for(int i : a){
            System.out.print(i);
            System.out.print(" ");
        }
        System.out.println(" ");
    }
}