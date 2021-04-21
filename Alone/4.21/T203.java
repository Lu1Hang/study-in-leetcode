/**
 * @BelongsProject: study
 * @BelongsPackage: PACKAGE_NAME
 * @Author: Alone
 * @CreateTime: 2021-04-21 12:58
 * @Description:
 */
public class T203 {

    public ListNode removeElements(ListNode head, int val) {
        if(head == null)
            return null;
        ListNode res = new ListNode(-1);
        res.next = head;
        ListNode pre = res, now = head;
        while (now != null) {
            ListNode next = now.next;
            if(now.val == val){
                pre.next = next;
                now = next;
            } else {
                pre = now;
                now = next;
            }
        }
        return res.next;
    }
}
