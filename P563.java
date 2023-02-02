import sun.nio.cs.ext.MacHebrew;

public class P563 {

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

    int ans = 0;
    public int findTilt(TreeNode root) {
        dfs(root);
        return ans;
    }

    public int dfs(TreeNode root){
        if (root == null){
            return 0;
        }

        int sumOfleft = dfs(root.left);
        int sumOfright= dfs(root.right);
        ans += Math.abs(sumOfleft - sumOfright);

        return sumOfleft + sumOfright + root.val;
    }
}
