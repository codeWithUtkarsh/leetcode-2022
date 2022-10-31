class Solution {
    public int expressiveWords(String s, String[] words) {
     
        int res = 0;
        for(String elem: words){
            if(isStretch(s, elem)) res++;
        }
        return res;
    }
    
    

    private boolean isStretch(String s, String elem){
        
        int p1 = 0;
        int p2 = 0;
        
        while(p1 <s.length() && p2 < elem.length()){
            char a = s.charAt(p1);
            char b = elem.charAt(p2);
            
            if(a != b) return false;
            
            int i = p1, j = p2;
            while(i< s.length() && s.charAt(i) == a){
                i++;
            }
            
            while(j< elem.length() && elem.charAt(j) == a){
                j++;
            }
            
            int n1 = i-p1;
            int n2 = j-p2;
            if(n1 < n2 ||( n1 < 3 && n1 != n2)) return false;
            
            p1 = i;
            p2 = j;
        }
        
        if(p1 == s.length() && p2 == elem.length()){
            return true;
        }else{
            return false;
        }
    }
}