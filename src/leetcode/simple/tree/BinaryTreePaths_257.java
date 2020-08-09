package leetcode.simple.tree;

import leetcode.common.tree.TreeNode;

import java.util.ArrayList;
import java.util.List;

/**
 * @author marongxin
 * @version 1.0
 * @date 2020/8/8 17:17
 * 257. 二叉树的所有路径
 */
public class BinaryTreePaths_257 {

    public List<String> binaryTreePaths(TreeNode root) {
        List<String> paths = new ArrayList<>();
        binaryTreePathsHelper(paths, root, "");
        return paths;
    }

    public void binaryTreePathsHelper(List<String> paths, TreeNode root, String path) {
        if (root != null) {
            path = path + root.val;
            if (root.left == null && root.right == null) {
                paths.add(path);
            } else {
                path += "->";
                binaryTreePathsHelper(paths, root.left, path);
                binaryTreePathsHelper(paths, root.right, path);
            }
        }
    }
}
