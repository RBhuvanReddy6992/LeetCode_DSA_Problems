class Solution {
    int count=0;
    int result=0;
    public int countDigitOne(int n) {
        if(n==0){
            return count;
        }
       int temp=n;
       while(temp!=0){
           result=temp%10;
           if(result == 1) count++;

           temp=temp/10;

       }
        return countDigitOne(n-1);
        
    }
}