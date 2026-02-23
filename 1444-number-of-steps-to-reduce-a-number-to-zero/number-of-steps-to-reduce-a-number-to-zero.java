class Solution {
    public int numberOfSteps(int num) {
        if(num == 0) return 0;

            if(num % 2 == 0)
                return 1 + numberOfSteps(num/2);
            else
                return 1 + numberOfSteps(num-1);
        
    }
    private static boolean isOdd1(int num) {
        if(num%2==0){
            return true;
        }
        return false;
    }

    private static boolean isEven1(int num) {
        if(num%2 !=0){
            return true;
        }
        return false;
    }
}