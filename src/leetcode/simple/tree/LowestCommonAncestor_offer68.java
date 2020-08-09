package leetcode.simple.tree;

import leetcode.common.tree.TreeNode;

/**
 * @author marongxin
 * @version 1.0
 * @date 2020/8/8 16:12
 * 剑指 Offer 68 - I. 二叉搜索树的最近公共祖先
 */
public class LowestCommonAncestor_offer68 {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if (root == null) return null;
        int rootVal = root.val;
        if (p.val < rootVal && q.val < rootVal) {
            return lowestCommonAncestor(root.left, p, q);
        } else if (p.val > rootVal && q.val > rootVal) {
            return lowestCommonAncestor(root.right, p, q);
        }
        return root;
    }
}