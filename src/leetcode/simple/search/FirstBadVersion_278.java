//package leetcode.simple.search;
//
///**
// * @author marongxin
// * @version 1.0
// * @date 2020/7/31 23:32
// */
//public class FirstBadVersion_278 {
//    public int firstBadVersion(int n) {
//        int left = 1;
//        int right = n;
//        int mid = 0;
//        while (left <= right) {
//            mid = left + ((right - left) >> 1);
//            if (isBadVersion(mid)) {
//                if (mid == 1 || !isBadVersion(mid - 1)) {
//                    return mid;
//                } else {
//                    right = mid - 1;
//                }
//            } else {
//                left = mid + 1;
//            }
//
//
//        }
//        return -1;
//    }
//}
