package leetcode.simple.tree;

import leetcode.common.tree.TreeNode;

import java.util.ArrayList;
import java.util.List;

/**
 * @author marongxin
 * @version 1.0
 * @date 2020/8/10 22:22
 */
public class LevelOrder_offer32_2 {
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> res = new ArrayList<>();
        levelOrderHelper(res, root, 0);
        return res;
    }

    private void levelOrderHelper(List<List<Integer>> res, TreeNode root, int depth) {
        if (root == null) {
            return;
        }
        if (res.size()<=depth){
            res.add(new ArrayList<>());
        }
        res.get(depth).add(root.val);
        levelOrderHelper(res,root.left,depth+1);
        levelOrderHelper(res,root.right,depth+1);
    }
}
