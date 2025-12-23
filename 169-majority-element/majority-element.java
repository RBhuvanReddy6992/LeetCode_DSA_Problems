class Solution {
    public int majorityElement(int[] nums) {
        int n=nums.length;
        boolean visited[]= new boolean[nums.length];
        
        int result=0;
        for(int i=0;i<nums.length;i++){
            if(visited[i]){
                continue;
            }
            int count=0;
            for(int j=i;j<nums.length;j++){
                if(nums[i]==nums[j]){
                    count++;
                }
            }
             if(count>n/2){
               result=nums[i];
        }
        }
       
       return result; 
    }
}