/*
class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] res = new int[2];
        
        HashMap<Integer, Integer> map = new HashMap<>();
        
        for(int i = 0; i < nums.length; i++) {
            int diff = target - nums[i];
            
            if(!map.containsKey(nums[i])) {
                map.put(diff, i);
            } else {
                res[0] = map.get(nums[i]);
                res[1] = i;
                break;
            }
        }
            return res;
        
    }
}
*/
class Solution {
    public int[] twoSum(int[] nums, int target) {
         int[] res = new int[2];
        List<Integer> list = new ArrayList<>();
				
        for (int i=0; i < nums.length; i++) {
            list.add(target-nums[i]);
        }
        
        for (int i=0; i < nums.length; i++) {
        //    Integer num = new Integer(nums[i]);
            int idx = list.indexOf(nums[i]);
            if (idx > -1 && idx != i)  {
                res[0] = i;
                res[1] = idx;
                break;
            }
        }
        
        return res;   
    }
}