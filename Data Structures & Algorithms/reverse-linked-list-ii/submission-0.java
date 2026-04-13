class Solution {
    public ListNode reverseBetween(ListNode head, int left, int right) {
        
        if (head == null || left == right) return head;

        ListNode prev = null;
        ListNode curr = head;
        int i = 1;

        while (i < left) {
            prev = curr;
            curr = curr.next;
            i++;
        }

        ListNode beforeStart = prev;
        ListNode start = curr;

        prev = null;
        while (i <= right) {
            ListNode next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
            i++;
        }

        if (beforeStart != null) {
            beforeStart.next = prev;
        } else {
            head = prev;
        }

        start.next = curr;

        return head;
    }
}