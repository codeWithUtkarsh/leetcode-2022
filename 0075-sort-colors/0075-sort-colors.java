class Solution {
    public void sortColors(int[] nums) {
        
        //since three values are only possible; creating a bucket
        int[] bucket = new int[3];
        
        //fill the bucket
        for(int element:nums)
            bucket[element]++;
            
        //reproduce the sorted nums
        int count = 0;
        for(int i=0; i<3; i++)
            while(bucket[i]-- > 0)
                nums[count++] = i;
    }
}