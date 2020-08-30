//给定两个字符串 s 和 t ，编写一个函数来判断 t 是否是 s 的字母异位词。 
//
// 示例 1: 
//
// 输入: s = "anagram", t = "nagaram"
//输出: true
// 
//
// 示例 2: 
//
// 输入: s = "rat", t = "car"
//输出: false 
//
// 说明: 
//你可以假设字符串只包含小写字母。 
//
// 进阶: 
//如果输入字符串包含 unicode 字符怎么办？你能否调整你的解法来应对这种情况？ 
// Related Topics 排序 哈希表 
// 👍 237 👎 0

package main.java.leetcode.editor.cn;

import java.util.Arrays;

/**
 * leetcode 242 有效的字母异位词
 * 2020-08-18 21:22:39	marongxin
 */

public class ValidAnagram {
    public static void main(String[] args) {
        Solution solution = new ValidAnagram().new Solution();
    }

    /**
     * 使用排序，进行比较
     * 排序成本 O(nlogn)
     * 比较两个字符串的成本O(n)排序时间占主导地位，
     * 总体时间复杂度为O(nlogn)
     * 执行耗时:3 ms,击败了86.61% 的Java用户
     * 内存消耗:39.9 MB,击败了50.98% 的Java用户
     */
    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public boolean isAnagram(String s, String t) {
            if (s == null || t == null || s.length() != t.length()) {
                return false;
            }
            char[] arr1 = s.toCharArray();
            char[] arr2 = t.toCharArray();
            Arrays.sort(arr1);
            Arrays.sort(arr2);
            return Arrays.equals(arr1, arr2);
        }
    }

    //leetcode submit region end(Prohibit modification and deletion)

    /**
     * 哈希表法
     * 不一定要用map,用hash思想
     * 时间复杂度O(n),空间复杂度O(1)
     */
    class Solution2 {
        public boolean isAnagram(String s, String t) {
            if (s == null || t == null || s.length() != t.length()) {
                return false;
            }
            int[] count = new int[26];
            for (int i = 0; i < s.length(); i++) {
                count[s.charAt(i) - 'a']++;
                count[t.charAt(i) - 'a']--;
            }
            for (int c : count
            ) {
                if (c != 0) {
                    return false;
                }
            }
            return false;
        }
    }
}