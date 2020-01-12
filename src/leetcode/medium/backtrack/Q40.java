package leetcode.medium.backtrack;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Q40 {
    static List<List<Integer>> result = new ArrayList<List<Integer>>();

    public static List<List<Integer>> combinationSum2(int[] candidates, int target) {
        Arrays.sort(candidates);
        List<Integer> list = new ArrayList<>();
        backtrack(candidates, 0, target, list);
        return result;
    }

    public static void backtrack(int[] candidates, int start, int target, List<Integer> list) {
        if (target < 0) {
            return;
        } else if (target == 0  ) {
            result.add(new ArrayList<>(list));
        }else {
            for (int i = start; i <candidates.length ; i++) {
                if (i > start && candidates[i] == candidates[i - 1]) {
                    continue;
                }
                list.add(candidates[i]);
                backtrack(candidates,i+1,target-candidates[i],list);
                list.remove(list.size() - 1);
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {10, 1, 2, 7, 6, 1, 5};
        int target = 8;
        System.out.println(combinationSum2(arr,target));
    }
}
