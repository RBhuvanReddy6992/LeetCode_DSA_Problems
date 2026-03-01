class Solution {
    public String longestPalindrome(String s) {
        if(s.length()==1){
            return ""+s.charAt(0);
        }
        int i=0;
        while(i<s.length()){
            int j=i+1;
            while(j<s.length()){
                if(s.charAt(i)==s.charAt(j)){
                    return s.substring(i,j+1);
                }
                j++;
            }
            i++;
        }
        return "";
    }
}