package leetcode.simple.tree;

import leetcode.common.tree.TreeNode;

/**
 * @author marongxin
 * @version 1.0
 * @date 2020/8/10 21:48
 */
public class MaxDepth_offer55 {
    public int maxDepth(TreeNode root) {
        if (root==null)return 0;
        return 1 + Math.max(maxDepth(root.left), maxDepth(root.right));
    }
}
