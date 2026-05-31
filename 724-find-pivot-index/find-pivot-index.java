class Solution {
    public int pivotIndex(int[] nums) {
        for(int i=1;i<nums.length;i++){
            nums[i]=nums[i-1]+nums[i];
        }
        int leftsum=0;
        int rightsum=0;
        int totalsum=nums[nums.length-1];
        for(int i=0;i<nums.length;i++){

            if(i==0){
                leftsum =0;
            }else {
                leftsum=nums[i-1];
            }
            rightsum=totalsum-nums[i];
            if(leftsum == rightsum){
                return i;
            }
        }
        return -1;
    }
}