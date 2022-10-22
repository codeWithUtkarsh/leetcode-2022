class Solution {
    public int findDuplicate(int[] nums) {
    Set<Integer> set = new HashSet<>();
       /* 
        for(int elem: nums)
        {
            if(!set.add(elem))
                return elem;
        }
        return 0;
        */
        
        
        for(int elem: nums)
        {
            if(!set.contains(elem)) set.add(elem);
            else return elem;
        }
        return 0;
    }
}