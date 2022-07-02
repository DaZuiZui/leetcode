import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class P637 {
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

    //记录总和
    List<Double> res = new ArrayList<>();
    Map<Integer,Integer> map = new HashMap<>();

    public List<Double> averageOfLevels(TreeNode root) {
        dfs(root,1);
        for (int i = 0; i < res.size(); i++) {
            res.set(i,res.get(i) / map.get(i+1));
        }

        System.out.println(res);
        return res;
    }

    public void dfs(TreeNode node,int hei){
        if (node == null){
            return;
        }

        if(node.val == 9)
            //System.out.println(hei);
            if (hei > res.size()){
                res.add(node.val*1.0);
                map.put(hei,1);
            }else{
                res.set(hei-1,(res.get(hei-1) + (node.val*1.0)));
                map.put(hei,map.get(hei)+1);
            }

        dfs(node.left,hei+1);
        dfs(node.right,hei+1);
    }
}
