package leetcode.simple.tree;

import leetcode.common.tree.TreeNode;

/**
 * @author marongxin
 * @version 1.0
 * @date 2020/8/8 15:51
 * 700. 二叉搜索树中的搜索
 */
public class SearchBST_700 {
    public TreeNode searchBST(TreeNode root, int val) {
        if (root == null || root.val == val) return root;
        return val > root.val ? searchBST(root.right, val) : searchBST(root.left, val);
    }
}
