package leetcode.simple.dp;

public class Q122 {
    public static int maxProfit(int[] prices) {
        if (prices == null || prices.length == 0) {
            return 0;
        }
        int max = 0, min = prices[0];
        for (int i = 1; i < prices.length - 1; i++) {
            if (prices[i] < min) {
                min = prices[i];
                continue;
            }
            if (prices[i] > min && prices[i] > prices[i + 1]) {
                max = max + prices[i] - min;
                min = prices[i + 1];
            }
        }

        return Math.max(max, max + prices[prices.length - 1] - min);
    }

    public static void main(String[] args) {
        int[] arr = {7, 1, 5, 3, 6, 4};
        int[] arr1 = {1, 2, 3, 4, 5};
        System.out.println(maxProfit(arr));
        System.out.println(maxProfit(arr1));
    }
}
