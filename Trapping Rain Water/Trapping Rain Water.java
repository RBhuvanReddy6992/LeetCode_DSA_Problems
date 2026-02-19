class Solution {
    public int trap(int[] height) {
        int i=0;
        int j=i+1;
        int units=0;
        while(i<=height.length-1 && j<=height.length-1){
            if(height[i]>height[j]){
                units=units+(height[i]-height[j]);
                j++;
            }else if(height[i] < height[j]){
                i++;
                j++;
            }
        }
        return units;
    }
}