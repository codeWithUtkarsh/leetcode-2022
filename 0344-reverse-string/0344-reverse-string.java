class Solution {
    public void reverseString(char[] s) {
        int length = s.length;
        for(int i=0; i<length/2; i++){
            char tmp = s[length-i-1];
            s[length-i-1] = s[i]; 
            s[i] = tmp;
        }
    }
}