package leetcode.simple.tree;

import leetcode.common.tree.Node;

import java.util.ArrayList;
import java.util.List;

/**
 * @author marongxin
 * @version 1.0
 * @date 2020/8/5 22:07
 * N叉树的后序遍历
 */
public class Postorder_590 {
    List<Integer> res=new ArrayList<>();
    public List<Integer> postorder(Node root) {
        if(root==null) return res;//如果根节点为空就直接返回list
        if(root.children!=null){//先遍历子节点
            for(Node node:root.children){
                postorder(node);//递归，将子节点作为根节点传入postorder函数遍历
            }
        }
        res.add(root.val);//访问根节点
        return res;
    }
}
