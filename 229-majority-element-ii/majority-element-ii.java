class Solution {
    public List<Integer> majorityElement(int[] nums) {
        int n=nums.length;
        List<Integer> result= new ArrayList<>();
        if(n==0 ){
           return result;
        }
        Map<Integer,Integer> m= new HashMap<>();
        for(int x:nums){
            if(m.containsKey(x)){
                m.put(x,m.get(x)+1);
            }else{
                m.put(x,1);
            }
        }
        for(Map.Entry<Integer,Integer> entry:m.entrySet()){
            if(entry.getValue()>n/3){
             result.add(entry.getKey());
            }
        }
        return result;
    }
}