import java.util.HashSet;
import java.util.Set;

public class LCP44 {
    public class TreeNode {
       int val;
       TreeNode left;
       TreeNode right;
       TreeNode(int x) { val = x; }
    }

    public static void main(String[] args) {

    }

    private Set<Integer> set = new HashSet<>();
    public int numColor(TreeNode root) {
        dfs(root);
        return set.size();
    }

    public void dfs(TreeNode node){
        if (node == null) {
            return;
        }
        set.add(node.val);
        dfs(node.left);
        dfs(node.right);
    }
}
