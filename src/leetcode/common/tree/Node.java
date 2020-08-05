package leetcode.common.tree;

import java.util.List;

/**
 * @author marongxin
 * @version 1.0
 * @date 2020/8/5 22:02
 */
public class Node {
    public int val;
    public List<Node> children;

    public Node() {}

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, List<Node> _children) {
        val = _val;
        children = _children;
    }
};
