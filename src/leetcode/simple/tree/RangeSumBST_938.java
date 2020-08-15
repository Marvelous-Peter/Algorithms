package leetcode.simple.tree;

import leetcode.common.tree.TreeNode;

/**
 * @author marongxin
 * @version 1.0
 * @date 2020/8/10 21:27
 * 938. 二叉搜索树的范围和
 */
public class RangeSumBST_938 {
    int res = 0;

    public int rangeSumBST(TreeNode root, int L, int R) {
        if (root == null) return 0;
        int rootVal = root.val;
        if (rootVal <= R && rootVal >= L) {
            res += rootVal;
        }
        rangeSumBST(root.left, L, R);
        rangeSumBST(root.right, L, R);
        return res;
    }

    public int rangeSumBST2(TreeNode root, int L, int R) {
        if (root == null) return 0;
        if (L > root.val) {
            return rangeSumBST2(root.right, L, R);
        }
        if (R < root.val) {
            return rangeSumBST2(root.left, L, R);
        }
        return root.val + rangeSumBST2(root.right, L, R) + rangeSumBST2(root.left, L, R);
    }


}
