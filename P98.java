public class P98 {
    public static void main(String[] args) {

    }

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

    long pre = Long.MIN_VALUE;
    public boolean isValidBST(TreeNode root) {
        return dfs(root);
    }

    public boolean dfs(TreeNode root){
        if (root == null){
            return true;
        }
        boolean l = dfs(root.left);
        if (root.val < pre){
            return false;
        }
        pre = root.val;
        boolean r = dfs(root.right);

        return l && r;
    }
}
