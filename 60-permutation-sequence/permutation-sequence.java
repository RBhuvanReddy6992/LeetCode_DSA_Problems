class Solution {

    String answer = "";
    int count = 0;

    public String getPermutation(int n, int k) {

        String s = "";
        for (int i = 1; i <= n; i++) {
            s = s + i;
        }

        permutation(s, "", k);

        return answer;
    }

    
    private void permutation(String s, String p, int k) {

        if (s.isEmpty()) {
            count++;
            if (count == k) {
                answer = p;
            }
            return;   
        }

        
        for (int i = 0; i < s.length(); i++) {

            char ch = s.charAt(i);

            String remaining =
                    s.substring(0, i) + s.substring(i + 1);

            permutation(remaining, p + ch, k);

            
            if (!answer.isEmpty()) return;
        }
    }
}