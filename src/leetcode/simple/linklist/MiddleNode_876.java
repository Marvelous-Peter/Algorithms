package leetcode.simple.linklist;

import leetcode.common.ListNode;

/**
 * @author marongxin
 * @version 1.0
 * @date 2020/7/25 19:50
 */
public class MiddleNode_876 {
    public ListNode middleNode(ListNode head) {
        if (head == null || head.next ==null) {
            return head;
        }
        ListNode slow = head;
        ListNode fast = head;
        while (fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        return  slow;
    }
}
