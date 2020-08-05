package leetcode.simple.tree;

import leetcode.common.tree.TreeNode;

import java.util.Arrays;

/**
 * @author marongxin
 * @version 1.0
 * @date 2020/8/5 23:35
 * 左叶子之和
 */
public class SumOfLeftLeaves_404_2 {

    //使用标志位求和
    public int sumOfLeftLeaves(TreeNode root) {
        return sumOfLeftLeaves(root, false);
    }

    /**
     * @param root
     * @param flag 是否是左节点
     * @return
     */
    private int sumOfLeftLeaves(TreeNode root, boolean flag) {
        if (root == null) {
            return 0;
        }
        if (flag && root.left == null && root.right == null) {
            return root.val;
        }
        int leftSum = sumOfLeftLeaves(root.left, true);
        int rightSum = sumOfLeftLeaves(root.right, false);
        return leftSum + rightSum;
    }
}
