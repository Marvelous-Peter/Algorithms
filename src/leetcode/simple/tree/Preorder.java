package leetcode.simple.tree;

import leetcode.common.tree.Node;

import java.util.ArrayList;
import java.util.List;

/**
 * @author marongxin
 * @version 1.0
 * @date 2020/8/10 21:56
 * 589. N叉树的前序遍历
 */
public class Preorder {
    public List<Integer> preorder(Node root) {
        List<Integer> list = new ArrayList<>();
        helper(list, root);
        return list;
    }

    private void helper(List<Integer> list, Node root) {
        if (root == null) return;
        if (root != null) {
            list.add(root.val);
            for (Node temp : root.children) {
                helper(list, temp);
            }
        }
    }
}
