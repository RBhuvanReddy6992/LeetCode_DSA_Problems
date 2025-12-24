class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {

        Set<Integer> s1= new HashSet<>();
        Set<Integer> s2= new HashSet<>();
        
        for(int x:nums1){
            s1.add(x);
        }
        for(int y:nums2){
            s2.add(y);
        }
        s1.retainAll(s2);

        
        int index = 0;
        int result[]= new int[s1.size()];
        for (int val : s1) {
            result[index++] = val;
        }

        return result;
    }
}