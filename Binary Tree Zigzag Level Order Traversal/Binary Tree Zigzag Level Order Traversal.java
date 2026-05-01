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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> result = new ArrayList<>();

         if(root == null) return result;

        Queue<TreeNode> q= new LinkedList<>();
        q.offer(root);
        int count=0;

        while(!q.isEmpty()){
            int size=q.size();
            List<Integer> level = new ArrayList<>();

            if(count == 0){
                for(int i=0;i<size;i++){
            TreeNode current=q.poll();
            level.add(current.val);

            if(current.right != null){
                q.offer(current.right);
            }

            if(current.left != null){
                q.offer(current.left);
            }

            
            }
            }else{
                for(int i=0;i<size;i++){
            TreeNode current=q.poll();
            level.add(current.val);

            if(current.left != null){
                q.offer(current.left);
            }

            if(current.right != null){
                q.offer(current.right);
            }
            }
            }
            count++;
            result.add(level); 
        }
        
        

        return result;
        
    }

}