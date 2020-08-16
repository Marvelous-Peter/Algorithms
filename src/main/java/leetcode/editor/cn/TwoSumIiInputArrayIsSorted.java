//给定一个已按照升序排列 的有序数组，找到两个数使得它们相加之和等于目标数。 
//
// 函数应该返回这两个下标值 index1 和 index2，其中 index1 必须小于 index2。
//
// 说明: 
//
// 
// 返回的下标值（index1 和 index2）不是从零开始的。 
// 你可以假设每个输入只对应唯一的答案，而且你不可以重复使用相同的元素。 
// 
//
// 示例: 
//
// 输入: numbers = [2, 7, 11, 15], target = 9
//输出: [1,2]
//解释: 2 与 7 之和等于目标数 9 。因此 index1 = 1, index2 = 2 。 
// Related Topics 数组 双指针 二分查找 
// 👍 379 👎 0

package main.java.leetcode.editor.cn;

import java.util.Arrays;

/**
 * leetcode 167 两数之和 II - 输入有序数组
 * 2020-08-16 23:17:19	marongxin
 */

public class TwoSumIiInputArrayIsSorted {
    public static void main(String[] args) {
        Solution solution = new TwoSumIiInputArrayIsSorted().new Solution();
        int[] arr = new int[]{2, 7, 11, 15};
        int[] res = solution.twoSum(arr, 9);
        System.out.println(Arrays.toString(res));
    }

    //leetcode submit region begin(Prohibit modification and deletion)

    /**
     * 二分查找
     * 时间复杂度：O(nlogn)，其中 nn 是数组的长度。
     * 需要遍历数组一次确定第一个数，时间复杂度是O(n)，
     * 寻找第二个数使用二分查找，时间复杂度是O(logn)
     * 因此总时间复杂度是 O(nlogn)。
     */
    class Solution {
        public int[] twoSum(int[] numbers, int target) {
            if (numbers == null || numbers.length == 0 || target < numbers[0]) return new int[0];
            for (int i = 0; i < numbers.length - 1; i++) {
                int left = i + 1, right = numbers.length - 1;
                int mid = 0, sum = 0;
                while (left <= right) {
                    mid = left + ((right - left) >> 1);
                    sum = numbers[mid] + numbers[i];
                    if (sum == target && mid != i) {
                        return new int[]{i + 1, mid + 1};
                    }
                    if (sum < target) {
                        left = mid + 1;
                    } else if (sum > target) {
                        right = mid - 1;
                    }
                }
            }
            return new int[0];
        }
    }

//leetcode submit region end(Prohibit modification and deletion)

    /**
     * 双指针法
     * 时间复杂度O(n) 空间复杂度O(1)
     */
    class Solution2 {
        public int[] twoSum(int[] numbers, int target) {
            if (numbers == null || numbers.length == 0 || target < numbers[0]) {
                return new int[]{-1, -1};
            }
            int i = 0, j = numbers.length - 1, sum = 0;
            while (i < j) {
                sum = numbers[i] + numbers[j];
                if (sum > target) {
                    j--;
                }
                if (sum < target) {
                    i++;
                }
                if (sum == target) {
                    return new int[]{i + 1, j + 1};
                }
            }
            return new int[]{-1, -1};
        }
    }

}
