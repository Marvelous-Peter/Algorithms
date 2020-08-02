package leetcode.medium.sort;

import java.util.Arrays;

/**
 * @author marongxin
 * @version 1.0
 * @date 2020/7/29 22:21
 */
public class SortArray_912 {

    // 冒泡排序O(n^2)
    // 算法没错，但数量大时超时，无法通过
    public int[] sortArray(int[] nums) {
        if (nums == null || nums.length == 0 || nums.length == 1) {
            return nums;
        }
        int n = nums.length;
        for (int i = 0; i < n; i++) {
            boolean flag = false;
            for (int j = 0; j < n - 1; j++) {
                if (nums[j] <= nums[j + 1]) {
                    continue;
                }
                int temp = nums[j + 1];
                nums[j + 1] = nums[j];
                nums[j] = temp;
                flag = true;  // 表示有数据交换
            }
            if (!flag) break;
        }
        return nums;
    }

    // 快速排序O(nlogn)
     public int[] quickSort(int[] arr,int n){
        quickSortHelper(arr,0,n-1);
        return arr;
     }
     public void quickSortHelper(int[] arr,int left,int right){
        if (left>=right)return;
        int tag = partition(arr,left,right);
        quickSortHelper(arr,left,tag-1);
        quickSortHelper(arr,tag+1,right);
     }

     public int partition(int[] arr,int left,int right){
        int pivot = arr[right];
        int i = left;
         for (int j = left; j <right ; j++) {
             if (arr[j]>=pivot)continue;
             swap(arr,i,j);
             i++;
         }
         swap(arr,i,right);
         return i;
     }

     public void swap(int[] arr,int i ,int j){
        int temp = arr[j];
        arr[j] = arr[i];
        arr[i] = temp;
     }

    public static void main(String[] args) {
        int[] arr = new int[]{3, 4, 2, 6, 1};
        //System.out.println(Arrays.toString(new SortArray_912().sortArray(arr)));
        System.out.println(Arrays.toString(new SortArray_912().quickSort(arr,arr.length)));
        System.out.println(Arrays.toString(arr));
    }
}
