package leetcode.simple.search;

/**
 * @author marongxin
 * @version 1.0
 * @date 2020/8/2 23:41
 * 查找最后一个小于等于给定值的元素
 */
public class SearchLastSmaller {
    public int searchLastSmaller(int[] nums, int target) {
        if (nums.length == 0) {
            return 0;
        }
        int low = 0, high = nums.length - 1;
        while (low <= high) {
            int mid = low + ((high - low) >> 1);
            if (nums[mid] <= target) {
                if (mid == nums.length - 1 || nums[mid + 1] > target) return mid;
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        //当target大于所有元素时，插入到最后位置
        return high;
    }

    public static void main(String[] args) {
        int[] nums = new int[]{3, 5, 6, 8, 9, 10};
        System.out.println(new SearchLastSmaller().searchLastSmaller(nums, 7));
        System.out.println(new SearchLastSmaller().searchLastSmaller(nums, 11));
        System.out.println(new SearchLastSmaller().searchLastSmaller(nums, 1));
    }
}
