class Solution {
    public void moveZeroes(int[] nums) {
        int k=0;
        int i=0;
        while(i<nums.length){
            if (nums[i] != 0) {
                nums[k]=nums[i];
                k++;
            }

            i++;
        }
        while (k<=nums.length-1){
            nums[k++]=0;
            
        }
        
    }
}