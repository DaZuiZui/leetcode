package leccod;

public class Offer55II {
    public class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode(int x) { val = x; }
   }

    public boolean isBalanced(TreeNode root) {
        if (root == null) return true;
        return Math.abs(dfs(root.left) - dfs(root.right)) <= 1 && isBalanced(root.left) && isBalanced(root.right);
    }

    public int dfs(TreeNode root){
        if (root == null) return 0;
        return Math.max(dfs(root.left),dfs(root.right))+1;
    }
}
