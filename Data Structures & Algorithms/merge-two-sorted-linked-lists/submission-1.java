class Solution {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode temp1=list1;
        ListNode temp2=list2;
        
        ListNode dummy = new ListNode(-1);
        ListNode ans = dummy;
        while(temp1!=null && temp2!=null){
            if(temp1.val>temp2.val){
            ans.next=temp2;
            temp2=temp2.next;
            }
            else{
            ans.next=temp1;
            temp1=temp1.next;
            }
            ans=ans.next;
        }
        if (temp1 != null) {
            ans.next = temp1;
        } else {
            ans.next = temp2;
        }
        return dummy.next;
    }
}