package leetcode.recursion;

import java.util.HashMap;
import java.util.Map;

/**
 * @author marongxin
 * @version 1.0
 * @date 2020/8/6 0:43
 * 泰波那契序列 Tn 定义如下： 
 * T0 = 0, T1 = 1, T2 = 1, 且在 n >= 0 的条件下 Tn+3 = Tn + Tn+1 + Tn+2
 * 给你整数 n，请返回第 n 个泰波那契数 Tn 的值。
 */
public class Tribonacci_1137 {

    //缓存计算值，避免超时
    Map<Integer, Integer> map = new HashMap<>();
    public int tribonacci(int n) {
        if (n == 0) {
            return 0;
        }
        if (n == 1 || n == 2) {
            return 1;
        }
        if (isExist(n)){
            return map.get(n);
        }else {
            int temp = tribonacci(n-3)+tribonacci(n-2)+tribonacci(n-1);
            map.put(n, temp);
            return temp;
        }
    }

    public boolean isExist(int n){
        return map.containsKey(n);
    }

    public static void main(String[] args) {
        System.out.println(new Tribonacci_1137().tribonacci(0));
        System.out.println(new Tribonacci_1137().tribonacci(1));
        System.out.println(new Tribonacci_1137().tribonacci(2));
        System.out.println(new Tribonacci_1137().tribonacci(3));
        System.out.println(new Tribonacci_1137().tribonacci(4));
    }
}
