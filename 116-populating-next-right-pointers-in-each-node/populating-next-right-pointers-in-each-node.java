/*
// Definition for a Node.
class Node {
    public int val;
    public Node left;
    public Node right;
    public Node next;

    public Node() {}
    
    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, Node _left, Node _right, Node _next) {
        val = _val;
        left = _left;
        right = _right;
        next = _next;
    }
};
*/

class Solution {
    public Node connect(Node root) {
        List<List<Node>> levels = getLevels(root);

    for (List<Node> level : levels) {
        for (int i = 0; i < level.size() - 1; i++) {
            level.get(i).next = level.get(i + 1);
        }
        
    }

    return root;
        
        
    }
    public List<List<Node>> getLevels(Node root) {
    List<List<Node>> result = new ArrayList<>();

    if (root == null) return result;

    Queue<Node> q = new LinkedList<>();
    q.offer(root);

    while (!q.isEmpty()) {
        int size = q.size();
        List<Node> level = new ArrayList<>();

        for (int i = 0; i < size; i++) {
            Node current = q.poll();
            level.add(current);

            if (current.left != null) q.offer(current.left);
            if (current.right != null) q.offer(current.right);
        }

        result.add(level);
    }

    return result;
}
}