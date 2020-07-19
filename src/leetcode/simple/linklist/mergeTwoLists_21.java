package leetcode.simple.linklist;

import leetcode.common.ListNode;

/**
 * @author marongxin
 * @version 1.0
 * @date 2020/7/19 22:28
 */
public class mergeTwoLists_21 {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {

        //哨兵节点，任意取值，最后返回pre.next即为所求
        ListNode sentinelNode = new ListNode(-1);
        //使用prehead进行操作，保持sentinelNode不变
        ListNode prehead = sentinelNode;

        while (l1 != null && l2 != null) {
            if (l1.val <= l2.val) {
                prehead.next = l1;
                l1 = l1.next;
            } else {
                prehead.next = l2;
                l2 = l2.next;
            }
            prehead = prehead.next;
        }
        // 跳出循环后l1 和 l2 还有一个还未被合并完，直接将链表末尾指向未合并完的链表即可
        prehead.next = l1 == null ? l2 : l1;
        return sentinelNode.next;
    }
}
