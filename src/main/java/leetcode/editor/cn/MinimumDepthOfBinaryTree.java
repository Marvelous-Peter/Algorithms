//给定一个二叉树，找出其最小深度。 
//
// 最小深度是从根节点到最近叶子节点的最短路径上的节点数量。 
//
// 说明: 叶子节点是指没有子节点的节点。 
//
// 示例: 
//
// 给定二叉树 [3,9,20,null,null,15,7], 
//
//     3
//   / \
//  9  20
//    /  \
//   15   7 
//
// 返回它的最小深度 2. 
// Related Topics 树 深度优先搜索 广度优先搜索 
// 👍 355 👎 0

package main.java.leetcode.editor.cn;

import leetcode.common.tree.TreeNode;

/**
 * leetcode 111 二叉树的最小深度
 * 2020-08-30 23:49:23	marongxin
 */

public class MinimumDepthOfBinaryTree {
    public static void main(String[] args) {
        Solution solution = new MinimumDepthOfBinaryTree().new Solution();
    }
    //leetcode submit region begin(Prohibit modification and deletion)

    /**
     * Definition for a binary tree node.
     * public class TreeNode {
     * int val;
     * TreeNode left;
     * TreeNode right;
     * TreeNode(int x) { val = x; }
     * }
     */
    class Solution {
        public int minDepth(TreeNode root) {
            if (root == null) return 0;
            if (root.left == null && root.right == null) return 1;

            if (root.right == null && root.left != null) {
                return 1 + minDepth(root.left);
            }
            if (root.left == null && root.right != null) {
                return 1 + minDepth(root.right);
            }
            return 1 + Math.min(minDepth(root.left), minDepth(root.right));
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}
