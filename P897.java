public class P897 {
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

    public static void main(String[] args) {

    }

    private TreeNode res ;
    public TreeNode increasingBST(TreeNode root) {
        TreeNode treeNode =new TreeNode(0);
        treeNode = res;
        dfs(root);
        return res;
    }

    private void dfs(TreeNode root){
        if (root == null){
            return;
        }

        dfs(root.left);
        res.right = new TreeNode(root.val);
        res = res.right;
        dfs(root.right);
    }
}
