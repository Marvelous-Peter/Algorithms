package leetcode.medium.linklist;

import leetcode.common.ListNode;

/**
 * @author marongxin
 * @version 1.0
 * @date 2020/7/25 18:56
 */
public class RemoveNthFromEnd_19 {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if (head == null || head.next == null) {
            return null;
        }

        //使用哨兵节点
        ListNode sentinelNode = new ListNode(-1);
        sentinelNode.next = head;

        ListNode fast = head;
        ListNode slow = sentinelNode;
        int i = 1;
        while (i < n) {
            fast = fast.next;
            i++;
        }
        while (fast.next != null) {
            fast = fast.next;
            slow = slow.next;
        }
        slow.next = slow.next.next;
        return sentinelNode.next;
    }
}
