public class P998 {
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

    public TreeNode insertIntoMaxTree(TreeNode root, int val) {
        if (root == null){
            return new TreeNode(val);
        }

        if (root.val < val){
            TreeNode treeNode = new TreeNode(val,root.left,null);
            return treeNode;
        }

        root.right = insertIntoMaxTree(root.right,val);

        return root;
    }
}
