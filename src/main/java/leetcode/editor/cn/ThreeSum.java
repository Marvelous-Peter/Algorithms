//给你一个包含 n 个整数的数组 nums，判断 nums 中是否存在三个元素 a，b，c ，使得 a + b + c = 0 ？请你找出所有满足条件且不重复
//的三元组。 
//
// 注意：答案中不可以包含重复的三元组。 
//
// 
//
// 示例： 
//
// 给定数组 nums = [-1, 0, 1, 2, -1, -4]，
//
//满足要求的三元组集合为：
//[
//  [-1, 0, 1],
//  [-1, -1, 2]
//]
// 
// Related Topics 数组 双指针 
// 👍 2487 👎 0

package main.java.leetcode.editor.cn;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * leetcode 15 三数之和
 * 2020-08-16 22:08:15	marongxin
 */

public class ThreeSum {
    public static void main(String[] args) {
        Solution solution = new ThreeSum().new Solution();
        int[] arr = new int[]{0, 0, 0};
        List<List<Integer>> res = solution.threeSum(arr);
    }

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public List<List<Integer>> threeSum(int[] nums) {
            //先排好序，内部快排O(nlogn)
            Arrays.sort(nums);
            List<List<Integer>> res = new ArrayList<>();
            int len = nums.length;
            for (int k = 0; k < nums.length - 2; k++) {
                if (k > 0 && nums[k] == nums[k - 1]) continue;
                if (nums[k] > 0) return res;
                int i = k + 1, j = len - 1;
                while (i < j) {
                    int sum = nums[k] + nums[i] + nums[j];
                    if (sum > 0) {
                        do {
                            j--;
                        } while (i < j && nums[j] == nums[j + 1]);
                    } else if (sum < 0) {
                        do {
                            i++;
                        }
                        while (i < j && nums[i] == nums[i - 1]);
                    } else {
                        res.add(new ArrayList<>(Arrays.asList(nums[k], nums[i], nums[j])));
                        do {
                            j--;
                        } while (i < j && nums[j] == nums[j + 1]);
                        do {
                            i++;
                        }
                        while (i < j && nums[i] == nums[i - 1]);
                    }
                }
            }
            return res;
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}
