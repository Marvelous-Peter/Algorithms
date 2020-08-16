//给定一个数组 nums，编写一个函数将所有 0 移动到数组的末尾，同时保持非零元素的相对顺序。 
//
// 示例: 
//
// 输入: [0,1,0,3,12]
//输出: [1,3,12,0,0] 
//
// 说明: 
//
// 
// 必须在原数组上操作，不能拷贝额外的数组。 
// 尽量减少操作次数。 
// 
// Related Topics 数组 双指针 
// 👍 696 👎 0

package main.java.leetcode.editor.cn;

import java.util.Arrays;


/**
 * leetcode 283 移动零
 * 2020-08-16 13:05:45	marongxin
 */

public class MoveZeroes {
    public static void main(String[] args) {
        Solution solution = new MoveZeroes().new Solution();
        int[] arr = new int[]{0, 1, 0, 3, 13};
        int[] arr2 = new int[]{2, 1};
        solution.moveZeroes(arr);
        System.out.println(Arrays.toString(arr));
    }

//leetcode submit region begin(Prohibit modification and deletion)

    class Solution {
        public void moveZeroes(int[] nums) {
            if (nums == null || nums.length == 0) return;
            //使用j记录非0元素交换之后的位置
            for (int i = 0, j = 0; i < nums.length; i++) {
                if (nums[i] != 0) {
                    if (j != i) {
                        nums[j] = nums[i];
                        nums[i] = 0;
                    }
                    j++;
                }
            }

        }
    }
//leetcode submit region end(Prohibit modification and deletion)
}


