public class T19 {
    /**
     * @Author Alone
     * @Description 二刷
     * @Date  2021/4/21 13:08
     * @Param [ListNode, int]
     * @return ListNode
     **/
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode slow = head, fast = head;
        for (int i = 0; i < n; i++) {
            fast = fast.next;
        }
        if(fast == null){
            return head.next;
        }
        while (fast.next != null){
            slow = slow.next;
            fast = fast.next;
        }
        slow.next = slow.next.next;
        return head;
    }
}