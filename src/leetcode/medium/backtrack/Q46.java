package leetcode.medium.backtrack;

import java.util.ArrayList;
import java.util.List;

public class Q46 {
    public static List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> result = new ArrayList<List<Integer>>();
        backtrack(nums, result, new ArrayList<Integer>());
        return result;

    }

    public static  void backtrack(int[] nums, List<List<Integer>> result, List<Integer> list) {
        if (list.size() == nums.length) {
            result.add(new ArrayList<>(list));
        } else {
            for (int i = 0; i < nums.length; i++) {
                if (list.contains(nums[i])) continue;
                list.add(nums[i]);
                backtrack(nums, result, list);
                list.remove(list.size() - 1);
            }
        }
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 3};
        System.out.println(permute(nums));

    }

}


