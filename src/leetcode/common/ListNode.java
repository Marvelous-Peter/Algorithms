package leetcode.common;

/**
 * @author marongxin
 * @version 1.0
 * @date 2020/7/19 22:10
 */
public class ListNode {
    public ListNode next;
    public int val;

    ListNode() {
    }

    public ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }

}
