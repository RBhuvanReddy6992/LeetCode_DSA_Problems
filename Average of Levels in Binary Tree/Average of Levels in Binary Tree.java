/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public List<Double> averageOfLevels(TreeNode root) {
        List<List<Integer>> result = new ArrayList<>();

        if(root == null) return new ArrayList<>();

        Queue<TreeNode> q = new LinkedList<>();
        q.offer(root);
        

        while(!q.isEmpty()){
            int size = q.size();
            List<Integer> level = new ArrayList<>();

            for(int i = 0; i < size; i++){
                TreeNode current = q.poll();

               
                level.add(current.val);

                
                if(current.left != null){
                    q.offer(current.left);
                }

                if(current.right != null){
                    q.offer(current.right);
                }
            }

        
            result.add(level);
        }
        List<Double> result1= new ArrayList<>();

        for(List<Integer> x: result){
            double sum=0;
            for(int val:x){
                sum=sum+val;
            }
            result1.add(sum/x.size());
        }

        return result1;
        
    }
}