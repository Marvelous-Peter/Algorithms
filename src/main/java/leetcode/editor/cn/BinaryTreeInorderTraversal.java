//给定一个二叉树，返回它的中序 遍历。 
//
// 示例: 
//
// 输入: [1,null,2,3]
//   1
//    \
//     2
//    /
//   3
//
//输出: [1,3,2] 
//
// 进阶: 递归算法很简单，你可以通过迭代算法完成吗？ 
// Related Topics 栈 树 哈希表 
// 👍 632 👎 0

package main.java.leetcode.editor.cn;

import leetcode.common.tree.TreeNode;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * leetcode 94 二叉树的中序遍历
 * 2020-08-19 20:33:08	marongxin
 */

public class BinaryTreeInorderTraversal {
    public static void main(String[] args) {
        Solution solution = new BinaryTreeInorderTraversal().new Solution();
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
        public List<Integer> inorderTraversal(TreeNode root) {
            List<Integer> list = new ArrayList<>();
            traversalHelper(list, root);
            return list;


        }

        private void traversalHelper(List<Integer> list, TreeNode root) {
            if (root == null) return;
            traversalHelper(list, root.left);
            list.add(root.val);
            traversalHelper(list, root.right);
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

    /**
     * 迭代
     * 时间复杂度O(n)
     * 空间复杂度O(n)
     */
    class Solution2 {
        public List<Integer> inorderTraversal(TreeNode root) {
            List<Integer> res = new ArrayList<>();
            Stack<TreeNode> stack = new Stack<>();
            TreeNode head = root;
            while (head != null || !stack.isEmpty()) {
                while (head != null) {
                    stack.push(head);
                    head = head.left;
                }
                head = stack.pop();
                res.add(head.val);
                head = head.right;
            }
            return res;
        }
    }
}
