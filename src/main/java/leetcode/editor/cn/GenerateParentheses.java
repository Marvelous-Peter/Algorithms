//数字 n 代表生成括号的对数，请你设计一个函数，用于能够生成所有可能的并且 有效的 括号组合。 
//
// 
//
// 示例： 
//
// 输入：n = 3
//输出：[
//       "((()))",
//       "(()())",
//       "(())()",
//       "()(())",
//       "()()()"
//     ]
// 
// Related Topics 字符串 回溯算法 
// 👍 1266 👎 0

package main.java.leetcode.editor.cn;

import java.util.ArrayList;
import java.util.List;

/**
 * leetcode 22 括号生成
 * 2020-08-27 23:35:37	marongxin
 */

public class GenerateParentheses {
    public static void main(String[] args) {
        Solution solution = new GenerateParentheses().new Solution();
        solution.generateParenthesis(3);
    }

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        List<String> list;

        public List<String> generateParenthesis(int n) {
            list = new ArrayList<String>();
            recurse(0, 0, n, "");
            return list;
        }

        private void recurse(int left, int right, int n, String currentStr) {
            //终止条件
            if (left == n && right == n) {
                list.add(currentStr);
                System.out.println(currentStr);
                return;
            }
            //recurse
            String leftStr = currentStr + "(";
            String rightStr = currentStr + ")";
            //进入下一层
            if (left < n) {
                recurse(left + 1, right, n, leftStr);
            }
            if (right < left && right < n) {
                recurse(left, right + 1, n, rightStr);
            }

        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}
