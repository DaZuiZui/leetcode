public class OfferII045 {
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

    int curheight = Integer.MIN_VALUE;
    int curval = 0;

    public int findBottomLeftValue(TreeNode root) {
        dfs(root,0);
        return curval;
    }

    public void dfs(TreeNode root,int height){
        if (root == null){
            return;
        }

        height++;
        dfs(root.left,height);
        dfs(root.right,height);
        if (curheight < height){
            curheight = height;
            curval = root.val;
        }
    }
}
