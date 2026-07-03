class Solution {

    public int findgcd(int a, int b) {
        if (b == 0)
            return a;
        return findgcd(b, a % b);
    }

    public ListNode insertGreatestCommonDivisors(ListNode head) {

        if (head == null)
            return null;

        ListNode curr = head;

        while (curr.next != null) {

            int gcd = findgcd(curr.val, curr.next.val);

            ListNode ll = new ListNode(gcd);

            ll.next = curr.next;
            curr.next = ll;

            curr = ll.next;
        }

        return head;
    }
}