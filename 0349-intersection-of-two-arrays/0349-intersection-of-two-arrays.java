class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
   
        // brute force
        /*
        Set<Integer> arr = new HashSet<>();
        for(int i = 0; i < nums1.length; i++)
        {
            for(int j = 0; j < nums2.length; j++)
            {
                if(nums1[i] == nums2[j])
                {
                    arr.add(nums1[i]);
                }
            }
        }
        return arr.stream().mapToInt(i->i).toArray();
       */
        
        // optimized 
        HashSet<Integer> set1 = new HashSet<>();
        for(Integer n : nums1) set1.add(n);
        
        HashSet<Integer> set2 = new HashSet<>();
        for(Integer n : nums2) set2.add(n);
        
        set1.retainAll(set2);
        
        int[] output = new int[set1.size()];
        int i = 0;
        for(int s : set1) output[i++] = s;
        return output;
    }
}