//给定一个二叉树，找出其最大深度。 
//
// 二叉树的深度为根节点到最远叶子节点的最长路径上的节点数。 
//
// 说明: 叶子节点是指没有子节点的节点。 
//
// 示例： 
//给定二叉树 [3,9,20,null,null,15,7]， 
//
//     3
//   / \
//  9  20
//    /  \
//   15   7 
//
// 返回它的最大深度 3 。 
// Related Topics 树 深度优先搜索 
// 👍 686 👎 0

package main.java.leetcode.editor.cn;

import leetcode.common.tree.TreeNode;

/**
 * leetcode 104 二叉树的最大深度
 * 2020-08-30 23:44:54	marongxin
 */

public class MaximumDepthOfBinaryTree {
    public static void main(String[] args) {
        Solution solution = new MaximumDepthOfBinaryTree().new Solution();
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
        public int maxDepth(TreeNode root) {
            //终止条件
            if (root == null) return 0;
            //当前处理
            //进入下一层
            int left = 1 + maxDepth(root.left);
            int right = 1 + maxDepth(root.right);
            //返回结果
            return Math.max(left, right);
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}
