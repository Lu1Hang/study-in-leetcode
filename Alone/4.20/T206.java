public class T206 {

    /**
     * @Author Alone
     * @Description 二刷
     * @Date  2021/4/20 11:03
     * @Param [ListNode]
     * @return ListNode
     **/
    public ListNode reverseList(ListNode head) {
        ListNode pre = null;
        ListNode now = head;
        while (now != null) {
            ListNode next = now.next;
            now.next = pre;
            pre = now;
            now = next;
        }
        return pre;
    }
}