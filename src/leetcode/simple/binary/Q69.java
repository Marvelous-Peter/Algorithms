package leetcode.simple.binary;

/**
 * @author marongxin
 * @version 1.0
 * @date 2020/6/7 20:31
 */
public class Q69 {
    public static int mySqrt(int x) {
        if (x <= 1) {
            return x;
        }
        int low = 1, high = x;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            int sqrt = x / mid;
            if (sqrt == mid) {
                return mid;
            }
            if (mid > sqrt) {
                high = mid - 1;
            } else if (mid < sqrt) {
                //此处不取 high = mid-1;的原因是我们判断是low<high,不是low<=high,左闭右开
                low = mid + 1;
            }
        }
        return high;
    }

    public static void main(String[] args) {
        int[] arr = new int[]{4, 8};
        System.out.println(mySqrt(4));
        System.out.println(mySqrt(8));
    }

}
