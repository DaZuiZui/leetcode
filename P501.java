import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class P501 {
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


    Map<Integer, Integer> map =new HashMap<>();
    public int[] findMode(TreeNode root) {
        dfs(root);
        List<Map.Entry<Integer,Integer>> list =new ArrayList<>();
        for (Map.Entry<Integer, Integer> tmp : map.entrySet()) {
            list.add(tmp);
        }
        list.sort((a,b)->{
            return b.getValue() - a.getValue();
        });
        int max = list.get(0).getValue();
        List<Integer> res = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getValue() != max){
                break;
            }

            res.add(list.get(i).getKey());
        }
        int[] resarr = new int[res.size()];
        for (int i = 0; i < res.size(); i++) {
            resarr[i] = res.get(i);
        }
        return resarr;
    }

    public void dfs(TreeNode root){
        if (root == null){
            return;
        }
        boolean switchs = true;
        //判断是否重树
        if(root.left != null){
            if (root.left.val <= root.val){
                switchs = true;
            }else{
                switchs = false;
            }
        }
        if (switchs && root.right != null){
            if (root.right.val >= root.val){
                switchs = true;
            }else{
                switchs = false;
            }
        }
        if (switchs){
            map.put(root.val,map.getOrDefault(root.val,0)+1);
        }

        dfs(root.left);
        dfs(root.right);
    }
}
