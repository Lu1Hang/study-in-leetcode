/**
 * @BelongsProject: study
 * @BelongsPackage: PACKAGE_NAME
 * @Author: Alone
 * @CreateTime: 2021-03-13 20:14
 * @Description:
 */
public class T143 {

    public void reorderList(ListNode head) {
        if(head == null || head.next == null)
            return;
        //找到链表中间节点
        ListNode slow = head, fast = head;
        while (fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        //翻转链表中间节点后的链表
        ListNode tail = slow.next;
        slow.next = null;
        ListNode first = tail.next;
        tail.next = null;
        while (first != null){
            ListNode tmp = first.next;
            first.next = tail;
            tail = first;
            first = tmp;
        }
        //两个链表合并
        ListNode one = head;
        while (one != null && tail != null){
            ListNode tmp1 = one.next;
            ListNode tmp2 = tail.next;
            one.next = tail;
            tail.next = tmp1;
            one = tmp1;
            tail = tmp2;
        }
        if(one == null)
            tail.next = one;
    }
}
