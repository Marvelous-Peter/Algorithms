package leetcode.simple.linklist;

import leetcode.common.ListNode;

/**
 * @author marongxin
 * @version 1.0
 * @date 2020/7/19 22:09
 */
public class HasCycel_141 {

    /**
     * 快慢指针
     * 类似于环形跑道，快慢两人跑步，如为环形则一定相遇
     * @param head
     * @return
     */
    public boolean hasCycle(ListNode head) {
        if (head == null || head.next == null) {
            return false;
        }
        ListNode slow = head;
        ListNode fast = head.next;
        while (slow != fast) {
            if (fast == null || fast.next == null) {
                return false;
            }
            slow = slow.next;
            fast = fast.next.next;
        }
        return true;
    }
}
