//给定一个二叉树，判断其是否是一个有效的二叉搜索树。 
//
// 假设一个二叉搜索树具有如下特征： 
//
// 
// 节点的左子树只包含小于当前节点的数。 
// 节点的右子树只包含大于当前节点的数。 
// 所有左子树和右子树自身必须也是二叉搜索树。 
// 
//
// 示例 1: 
//
// 输入:
//    2
//   / \
//  1   3
//输出: true
// 
//
// 示例 2: 
//
// 输入:
//    5
//   / \
//  1   4
//     / \
//    3   6
//输出: false
//解释: 输入为: [5,1,4,null,null,3,6]。
//     根节点的值为 5 ，但是其右子节点值为 4 。
// 
// Related Topics 树 深度优先搜索 
// 👍 743 👎 0

package main.java.leetcode.editor.cn;

import leetcode.common.tree.TreeNode;

/**
 * leetcode 98 验证二叉搜索树
 * 2020-08-30 23:39:38	marongxin
 */

public class ValidateBinarySearchTree {
    public static void main(String[] args) {
        Solution solution = new ValidateBinarySearchTree().new Solution();
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
        public boolean isValidBST(TreeNode root) {
            return helper(root, null, null);
        }

        private boolean helper(TreeNode root, TreeNode  lower, TreeNode upper) {
            //终止条件
            if (root == null) return true;
            //当前level处理
            int val = root.val;
            if (lower != null && lower.val > val) return false;
            if (upper != null && upper.val < val) return false;
            //进入下一层
            if (!helper(root.left, lower, root)) return false;
            if (!helper(root.right, root, upper)) return false;
            //返回结果
            return true;
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}
