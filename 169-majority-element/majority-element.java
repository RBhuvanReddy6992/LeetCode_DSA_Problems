class Solution {
    public int majorityElement(int[] nums) {
        int n= nums.length;
        int result=0;
        Map<Integer,Integer> m= new HashMap<>();
        for(int x:nums){
            if(m.containsKey(x)){
                m.put(x,m.get(x)+1);
            }else{
                m.put(x,1);
            }
        }
       for (Map.Entry<Integer, Integer> e : m.entrySet()) {
            if (e.getValue() > n / 2) {
                result = e.getKey();
            }
        }
       
       return result; 
    }
}