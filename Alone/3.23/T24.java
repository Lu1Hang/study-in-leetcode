/**
 * @BelongsProject: study
 * @BelongsPackage: PACKAGE_NAME
 * @Author: Alone
 * @CreateTime: 2021-03-23 19:32
 * @Description:
 */
public class T24 {

    public ListNode swapPairs(ListNode head) {
        ListNode res = new ListNode(0);
        res.next = head;
        ListNode front = res, tmp = res.next;
        while (tmp != null && tmp.next != null){
            ListNode next = tmp.next;
            ListNode behind = next.next;
            front.next = next;
            tmp.next = behind;
            next.next = tmp;
            front = tmp;
            tmp = behind;
        }
        return res.next;
    }
}
