package leetcode.simple.search;

/**
 * @author marongxin
 * @version 1.0
 * @date 2020/7/31 22:13
 */
public class BinarySearch_740 {
    public int search(int[] nums, int target) {
        if (nums == null || nums.length == 0) {
            return -1;
        }
        int low = 0, high = nums.length - 1;
        int mid = 0;
        while (low <= high) {
            mid = low + ((high - low) >> 1);
            int temp = nums[mid];
            if (temp == target) {
                return mid;
            }
            if (temp > target) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = new int[]{-1, 0, 3, 5, 9, 12};
        int target = 9;
        System.out.println(new BinarySearch_740().search(arr, target));
    }
}
