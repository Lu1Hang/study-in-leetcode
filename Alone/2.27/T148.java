/**
 * @BelongsProject: study
 * @BelongsPackage: PACKAGE_NAME
 * @Author: Alone
 * @CreateTime: 2021-02-27 12:58
 * @Description:
 */
public class T148 {

    /**
     * T148 链表排序
     * 归并排序 递推版
     * @param head
     * @return
     */
    public ListNode sortList(ListNode head) {
        int length = 0, intv = 1;
        ListNode res = new ListNode(-1);
        res.next = head;
        ListNode h = head;
        while (h != null) {
            length ++;
            h = h.next;
        }
        while (intv < length) {
            ListNode p = res;
            h = p.next;
            int i = intv;
            ListNode h1 = null, h2 = null;
            while (h != null) {
                i = intv;
                h1 = h;
                while (i > 0 && h != null) {
                    h = h.next;
                    i --;
                }
                if(i > 0) //没有h2了
                    break;
                i = intv;
                h2 = h;
                while (i > 0 && h != null) {
                    h = h.next;
                    i --;
                }
                //合并h1,h2
                int c1 = intv, c2 = intv - i;
                while (c1 > 0 && c2 > 0) {
                    if(h1.val < h2.val){
                        p.next = h1;
                        h1 = h1.next;
                        c1 --;
                    } else {
                        p.next = h2;
                        h2 = h2.next;
                        c2 --;
                    }
                    p = p.next;
                }
                //取h1和h2中剩余的部分
                p.next = c1 == 0 ? h2 : h1;
                while (c1 > 0 || c2 > 0) {
                    p = p.next;
                    c1 --;
                    c2 --;
                }
                p.next = h;
            }
            intv <<= 1;
        }
        return res.next;
    }
}

class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) {this.val = val;}
    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}
