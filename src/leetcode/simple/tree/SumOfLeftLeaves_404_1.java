package leetcode.simple.tree;

import leetcode.common.tree.TreeNode;

/**
 * @author marongxin
 * @version 1.0
 * @date 2020/8/5 23:02
 * 左叶子之和
 */
public class SumOfLeftLeaves_404_1 {
    int res = 0;

    //简单递归
    public int sumOfLeftLeaves(TreeNode root) {
        if (root == null) return 0;
        if (root.left != null && root.left.left == null && root.left.right == null) {
            res = res + root.left.val;
        }
        sumOfLeftLeaves(root.left);
        sumOfLeftLeaves(root.right);
        return res;
    }

    //使用标志位求和


}
