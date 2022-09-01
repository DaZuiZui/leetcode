public class P687 {
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

    int res = 0;
    public int longestUnivaluePath(TreeNode root) {
        dfs(root);
        return res;
    }

    public int dfs(TreeNode root){
       if (root == null){
           return 0;
       }

       int l = dfs(root.left);
       int r = dfs(root.right);
        int left1 = 0, right1 = 0;
        if (root.left != null && root.left.val == root.val) {
            left1 = l + 1;
        }
        if (root.right != null && root.right.val == root.val) {
            right1 = r + 1;
        }

       res = Math.max(l+r,res);
        return Math.max(l,r);
    }
}
