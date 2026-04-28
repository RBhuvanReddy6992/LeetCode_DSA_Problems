class Solution {
    public int[] buildArray(int[] nums) {
         
        int arr[]= new int[nums.length];
        
        for(int i=0;i<nums.length;i++){
            if(nums[i] != nums[nums[i]]){
                arr[i]=nums[nums[i]];
            }else{
                arr[i]=nums[i];
            }
        }

        return arr;
    }
}