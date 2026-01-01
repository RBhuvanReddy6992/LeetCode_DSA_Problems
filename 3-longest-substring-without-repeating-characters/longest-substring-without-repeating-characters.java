class Solution {
    public int lengthOfLongestSubstring(String s) {

        Set<Character> charn = new HashSet<>();
        int max = 0;
        int left = 0;

        for (int right = 0; right < s.length(); right++) {

            while (charn.contains(s.charAt(right))) {
                charn.remove(s.charAt(left));
                left++;
            }

            charn.add(s.charAt(right));
            max = Math.max(max, right - left + 1);
        }

        return max; 
    }
}