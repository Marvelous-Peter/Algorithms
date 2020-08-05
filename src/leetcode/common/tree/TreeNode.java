package leetcode.common.tree;

/**
 * @author marongxin
 * @version 1.0
 * @date 2020/8/5 22:25
 */
public class TreeNode {
    public int val;
    public TreeNode left;
    public TreeNode right;

    TreeNode(int x) {
        val = x;
    }

    TreeNode(int x,TreeNode left,TreeNode right) {
        val = x;
        left = left;
        right = right;
    }
}