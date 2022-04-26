package leccod;

public class Offer54 {
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }

    public static void main(String[] args) {

    }

    int res=0,k;
    public int kthLargest(TreeNode root, int k) {
        this.k = k;
        dfs(root);
        return res;
    }

    public void dfs(TreeNode root){
        if (root == null) return;
        //先查看右边，因为二茶树的规则 右边一定大
        dfs(root.right);
        if (k == 0) return;
        if (--k ==0) res = root.val;
        dfs(root.left);
    }
}
