//假设你正在爬楼梯。需要 n 阶你才能到达楼顶。 
//
// 每次你可以爬 1 或 2 个台阶。你有多少种不同的方法可以爬到楼顶呢？ 
//
// 注意：给定 n 是一个正整数。 
//
// 示例 1： 
//
// 输入： 2
//输出： 2
//解释： 有两种方法可以爬到楼顶。
//1.  1 阶 + 1 阶
//2.  2 阶 
//
// 示例 2： 
//
// 输入： 3
//输出： 3
//解释： 有三种方法可以爬到楼顶。
//1.  1 阶 + 1 阶 + 1 阶
//2.  1 阶 + 2 阶
//3.  2 阶 + 1 阶
// 
// Related Topics 动态规划 
// 👍 1187 👎 0

package main.java.leetcode.editor.cn;

import java.util.HashMap;
import java.util.Map;

/**
 * leetcode 70 爬楼梯
 * 2020-08-16 18:34:21	marongxin
 */

public class ClimbingStairs {
    public static void main(String[] args) {
        Solution solution = new ClimbingStairs().new Solution();
    }

    //leetcode submit region begin(Prohibit modification and deletion)

    /**
     * 递归法
     * 递归代码要警惕重复计算，使用数据结构（比如散列表）来保存已经求解过的 f(k)。
     * 空间复杂度O(n)
     */
    class Solution {
        Map<Integer, Integer> res = new HashMap<>();

        public int climbStairs(int n) {
            if (n == 0 || n == 1) return n;
            if (n == 2) return 2;
            if (res.containsKey(n)) {
                return res.get(n);
            } else {
                int count = climbStairs(n - 1) + climbStairs(n - 2);
                res.put(n, count);
                return count;
            }
        }
    }

    //leetcode submit region end(Prohibit modification and deletion)

    /**
     * 迭代循环
     * 时间复杂度O(n)
     * 空间复杂度O(1)
     */
    class Solution2 {
        public int climbStairs(int n) {
            if (n == 0 || n == 1 || n == 2) return n;
            int c1 = 1;
            int c2 = 2;
            for (int i = 3; i <= n; i++) {
                c2 = c1 + c2;
                c1 = c2 - c1;
            }
            return c2;
        }
    }
}
