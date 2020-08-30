//给定一个只包括 '('，')'，'{'，'}'，'['，']' 的字符串，判断字符串是否有效。 
//
// 有效字符串需满足： 
//
// 
// 左括号必须用相同类型的右括号闭合。 
// 左括号必须以正确的顺序闭合。 
// 
//
// 注意空字符串可被认为是有效字符串。 
//
// 示例 1: 
//
// 输入: "()"
//输出: true
// 
//
// 示例 2: 
//
// 输入: "()[]{}"
//输出: true
// 
//
// 示例 3: 
//
// 输入: "(]"
//输出: false
// 
//
// 示例 4: 
//
// 输入: "([)]"
//输出: false
// 
//
// 示例 5: 
//
// 输入: "{[]}"
//输出: true 
// Related Topics 栈 字符串 
// 👍 1801 👎 0

package main.java.leetcode.editor.cn;

import java.util.Stack;

/**
 * leetcode 20 有效的括号
 * 2020-08-17 22:39:10	marongxin
 */

public class ValidParentheses {
    public static void main(String[] args) {
        Solution solution = new ValidParentheses().new Solution();
        boolean flag = solution.isValid("{[]}");
        System.out.println(flag);
    }

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public boolean isValid(String s) {
            if (s.length() == 0) {
                return true;
            }
            char[] chs = s.toCharArray();
            Stack<Character> stack = new Stack<Character>();
            for (char ch : chs) {
                if (stack.isEmpty()) {
                    if (ch == ')' || ch == ']' || ch == '}') {
                        return false;
                    }
                    stack.push(ch);
                } else {
                    char peek = stack.peek();
                    if (peek == '(' && ch == ')') {
                        stack.pop();
                    } else if (peek == '[' && ch == ']') {
                        stack.pop();
                    } else if (peek == '{' && ch == '}') {
                        stack.pop();
                    } else if (ch == ')' || ch == ']' || ch == '}') {
                        return false;
                    } else stack.push(ch);
                }
            }
            return stack.isEmpty();
        }
    }

//leetcode submit region end(Prohibit modification and deletion)
}