class Solution {
    public int trap(int[] height) {
        int i=0;
        int j= height.length-1;
        int units=0;
        int leftmax=0;
        int rightmax=0;
        while(i<=j ){
            if(height[i]<=height[j]) {
                if (height[i] >= leftmax) {
                    leftmax = height[i];
                } else {
                    units = units + (leftmax - height[i]);
                }
                i++;
            }else{
                if(height[j]>= rightmax){
                    rightmax=height[j];
                }else {
                    units=units+(rightmax-height[j]);
                }
                j--;
            }
        }
        return units;
    }
}