import sun.reflect.generics.tree.Tree;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class P1110 {
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

    Set<Integer> set = new HashSet<>();
    List<TreeNode> res = new ArrayList<>();
    public List<TreeNode> delNodes(TreeNode root, int[] to_delete) {
        for (int i : to_delete) {
            set.add(i);
        }
        dfs(null,root);

        if (!set.contains(root.val)) res.add(root);
        return res;
    }

    public void dfs(TreeNode parent, TreeNode now){
        if (now == null){
            return;
        }

        dfs(parent,now.left);
        dfs(parent,now.right);

        if (set.contains(now.val)){
            if ( parent != null && parent.left == now) parent.left =null;
            if (  parent != null && parent.right == now) parent.right =null;

            if (now.left != null)res.add(now.left);
            if (now.right != null)res.add(now.right);

        }
    }

}
