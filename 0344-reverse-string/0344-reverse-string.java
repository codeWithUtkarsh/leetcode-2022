class Solution {
    public void reverseString(char[] s) {
        //initialize length create
        int length = s.length;
        for(int i=0; i<length/2; i++){
            
            //swap fist and last element and 
            char tmp = s[length-i-1];
            s[length-i-1] = s[i]; 
            s[i] = tmp;
        }
    }
}