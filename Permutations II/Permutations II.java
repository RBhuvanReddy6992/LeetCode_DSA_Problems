class Solution {

    static List<List<Integer>> result = new ArrayList<>();

    public List<List<Integer>> permuteUnique(int[] nums) {
        result = new ArrayList<>();                           
        List<Integer> current= new ArrayList<>();

        List<List<Integer>> results= helper(nums,current);

        Set<List<Integer>> unique= new LinkedHashSet<>(results);

        List<List<Integer>> finalresult = new ArrayList<>(unique);

        return finalresult;
    }

    public List<List<Integer>> helper(int [] nums,List<Integer> current){
        if(current.size() == nums.length){
            result.add(new ArrayList<>(current));
            return result;
        }

        for(int i=0;i<nums.length;i++){
            if(current.contains(nums[i])){
                continue;
            }

            current.add(nums[i]);
            helper(nums,current);
            current.remove(current.size()-1);
        }
        return result;
    }
}