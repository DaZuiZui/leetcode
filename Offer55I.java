package leccod;

public class Offer55I {
    public static void main(String[] args) {

    }

    public int maxDepth(TreeNode root) {
        if (root == null) return 0;
        int leftroot = maxDepth(root.left);
        int rigthroot = maxDepth(root.right);
        return Math.max(leftroot,rigthroot)+1;
    }
}
