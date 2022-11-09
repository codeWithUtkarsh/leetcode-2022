class Solution {
    List<List<Integer>> res = new ArrayList<>(); 
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        
        
      Stack<Integer> inRes = new Stack<>();  
      solve(candidates, 0, target, inRes); 
    
      return res;
    }
    
    
    private void solve(int[] nums, int p1, int target, Stack<Integer> inRes){
        
        if(target == 0){
            res.add(new ArrayList<>(inRes));
            return;
        }
        
        if(target < 0) return;
        
        while(p1 < nums.length){
            
            inRes.push(nums[p1]);
            solve(nums, p1, target-nums[p1], inRes);
            p1++;
            inRes.pop();
        }
    }
}