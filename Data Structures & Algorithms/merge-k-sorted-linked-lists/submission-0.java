class Solution {
    public ListNode mergeKLists(ListNode[] lists) {
          if (lists == null || lists.length == 0)
            return null;

        return partition(0, lists.length - 1,lists);
    }
    public ListNode partition(int s,int e,ListNode[] lists){

    if(s>e) return null;
    if(s==e) return lists[s];
    int mid=s+(e-s)/2;
    ListNode l1=partition(s,mid,lists);
     ListNode l2=partition(mid+1,e,lists);
    return merge(l1,l2);
    }
    public ListNode merge(ListNode l1,ListNode l2){
     if (l1 == null)
            return l2;

        if (l2 == null)
            return l1;

        if (l1.val <= l2.val) {
            l1.next = merge(l1.next, l2);
            return l1;
        } else {
            l2.next = merge(l1, l2.next);
            return l2;
        }
    }

}