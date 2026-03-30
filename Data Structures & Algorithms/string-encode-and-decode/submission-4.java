class Solution {
     public String encode(List<String> strs) {
        StringBuilder ans = new StringBuilder();
        for(String i : strs){
            ans.append(i.length()).append("#").append(i);
        }
        return ans.toString();
     
     }

    public List<String> decode(String str) {        
        List<String> ans = new ArrayList<>();
        int k = 0;
        while(k<str.length()){
            int st = k;
            while(str.charAt(k)!='#')k++;
            int s = Integer.parseInt(str.substring(st,k));
            k++;
            ans.add(str.substring(k,k+s)); 
            k = k+s;           
        }
    return ans;

    }
}

   /* public String encode(List<String> strs) {
        StringBuilder sb = new StringBuilder();
        for(String i : strs){
            sb.append(i.length()).append("#").append(i);
            
        }
        System.out.println(sb);
        return sb.toString();
    }

    public List<String> decode(String str) {        
        List<String> ans = new ArrayList<>();        
        int i = 0;
        while(i<str.length()){        
            int j = i;      
            while(str.charAt(j)!='#')j++;                             
            int len = Integer.parseInt(str.substring(i, j));
            j++;            
            ans.add(str.substring(j,j+len));
            i = j+len; 
        }

        return ans;
    }
}*/
