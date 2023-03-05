package weekly335;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

public class P2 {
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

    LinkedList<Long> list = new LinkedList<>();
    public long kthLargestLevelSum(TreeNode root, int k) {
        dfs(root,k);
        list.sort((a,b)->{
            return a > b ? 1 : -1;
        });
        return list.get(k);
    }

    public void dfs(TreeNode root, int index){
        if (root == null) return;
        if (index >= list.size()){
            list.add(0l);
        }
        list.set(index,list.get(index)+root.val);
        dfs(root.left,index+1);
        dfs(root.right,index+1);
    }
}
