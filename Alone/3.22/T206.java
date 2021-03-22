/**
 * @BelongsProject: study
 * @BelongsPackage: PACKAGE_NAME
 * @Author: Alone
 * @CreateTime: 2021-03-22 16:56
 * @Description:
 */
public class T206 {

    public ListNode reverseList(ListNode head) {
        ListNode pre = null;
        ListNode now = head;
        ListNode next = null;
        while (now != null) {
            next = now.next;
            now.next = pre;
            pre = now;
            now = next;
        }
        return pre;
    }
}
