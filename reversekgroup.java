class Solution {
    public ListNode reverseKGroup(ListNode head, int k) {
        if (head == null || k == 1) return head;
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode prevGroupEnd = dummy;
        ListNode curr = head;
        while (true) {
            ListNode kth = prevGroupEnd;
            for (int i = 0; i < k && kth != null; i++) {
                kth = kth.next;
            }
            if (kth == null) break;
            ListNode groupStart = prevGroupEnd.next;
            ListNode nextGroupStart = kth.next;
            ListNode prev = nextGroupStart;
            ListNode current = groupStart;
            while (current != nextGroupStart) {
                ListNode next = current.next;
                current.next = prev;
                prev = current;
                current = next;
            }
            prevGroupEnd.next = kth;
            prevGroupEnd = groupStart;
        }
        return dummy.next;
    }
}           
