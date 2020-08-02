package leetcode.simple.search;

/**
 * @author marongxin
 * @version 1.0
 * @date 2020/8/2 23:21
 * 搜索插入位置
 * 给定一个排序数组和一个目标值，在数组中找到目标值，并返回其索引。如果目标值不存在于数组中，返回它将会被按顺序插入的位置。
 * 你可以假设数组中无重复元素。
 */
public class SearchInsert_35 {
    public int searchInsert(int[] nums, int target) {
        if (nums.length == 0) {
            return 0;
        }
        int low = 0, high = nums.length - 1;
        while (low <= high) {
            int mid = low + ((high - low) >> 1);
            if (nums[mid] >= target) {
                if (mid == 0 || nums[mid - 1] < target) return mid;
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        //当target大于所有元素时，插入到最后位置
        return high + 1;
    }
}
