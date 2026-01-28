class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map <Integer,Integer> m= new HashMap<>();
        for(int i=0;i<nums.length;i++){
            int needed=target-nums[i];
        
        if(m.containsKey(needed)){
            return new int[]{m.get(needed),i};
        }
        m.put(nums[i],i);
        }
        return new int[]{};
        
    }
}
