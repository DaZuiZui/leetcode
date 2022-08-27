import java.util.ArrayList;
import java.util.List;

public class P662 {
}

class Solution {
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

    List<Long> list = new ArrayList<>();
    int res = 0;
    public int widthOfBinaryTree(TreeNode root) {
        dfs(root,0,0);
        return res;
    }

    public void dfs(TreeNode root,int d,long id){
       if (root == null){
           return ;
       }
       if (list.size() == d){
           list.add(id);
       }

        res = Math.max((int) (id - list.get(d) + 1),res);

       dfs(root.left,d+1,id * 2);
       dfs(root.right,d+1,id*2+1);
    }
}