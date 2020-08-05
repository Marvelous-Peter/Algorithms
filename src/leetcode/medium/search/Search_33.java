package leetcode.medium.search;

/**
 * @author marongxin
 * @version 1.0
 * @date 2020/8/4 23:46
 * 搜索旋转排序数组
 * 算法时间复杂度必须是 O(log n) 级别--------二分法O(logn)
 */
public class Search_33 {
    public int search(int[] nums, int target) {
        if (nums == null || nums.length == 0) {
            return -1;
        }
        int left = 0, right = nums.length - 1;
        while (left <= right) {
            int mid = left + ((right - left) >> 1);
            if (nums[mid] == target) {
                return mid;
            }
            if (nums[0] <= nums[mid]) {
                if (nums[left] <= target && target < nums[mid]) {
                    right = mid - 1;
                } else {
                    left = mid + 1;
                }
            } else {
                if (nums[mid] < target && target <= nums[nums.length - 1]) {
                    left = mid + 1;
                } else {
                    right = mid - 1;
                }
            }

        }
        return -1;
    }

    public static void main(String[] args) {
        //int[] nums = new int[]{4, 5, 6, 7, 0, 1, 2};
        int[] nums = new int[]{3, 5, 1};
        System.out.println(new Search_33().search(nums, 0));
        //System.out.println(new Search_33().search(nums,10));
        //System.out.println(new Search_33().search(nums,0));
    }
}
