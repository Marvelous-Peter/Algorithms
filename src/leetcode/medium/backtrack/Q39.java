package leetcode.medium.backtrack;

import java.util.ArrayList;
import java.util.List;

public class Q39 {
    static List<List<Integer>> result = new ArrayList<List<Integer>>();
    public static List<List<Integer>> combinationSum(int[] candidates, int target) {


        List<Integer> list = new ArrayList<>();
        backtrack(0,candidates,target,list);
        return result;
    }

    public static void backtrack(int start,int[] candidates,int target,List<Integer> list){
        if (target <0) {
            return;
        }
        else if(target == 0){
            result.add(new ArrayList<>(list));
        }
        else {
            for (int i = start; i < candidates.length; i++) {
                list.add(candidates[i]);
                backtrack(i,candidates,target-candidates[i],list);
                list.remove(list.size()-1);
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {2, 3,5};
        int target = 8;
        System.out.println(combinationSum(arr,target));
    }
}
