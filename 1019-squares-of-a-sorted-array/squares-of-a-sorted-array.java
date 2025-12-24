class Solution {
    public int[] sortedSquares(int[] nums) {
        int temp[]= new int[nums.length];
        int i=0;
        int j=nums.length-1;
        int index=temp.length-1;
        while(i<=j){
             if(Math.abs(nums[i])>=Math.abs(nums[j])){
                temp[index--]=nums[i]*nums[i];
                i++;
            }else{
                temp[index--]=nums[j]*nums[j];
                j--;
            }
        }
        for(int k=0;k<temp.length;k++){
            nums[k]=temp[k];
        }



       return nums; 
    }
}