package leccod;

public class P110 {
    public class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode() {}
      TreeNode(int val) { this.val = val; }
      TreeNode(int val, TreeNode left, TreeNode right) {
          this.val = val;
          this.left = left;
          this.right = right;
      }
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
