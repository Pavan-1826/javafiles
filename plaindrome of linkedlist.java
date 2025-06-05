class Solution {
    public boolean isPalindrome(ListNode head) {
        {
            Stack<Integer> s=new Stack<>();
            ListNode curr=head;
            while(curr!=null){
                s.push(curr.val);
                curr=curr.next;
            }
            ListNode t=head;
            while(t!=null){
               if(s.pop()!=t.val){
                return false;
               }
                t=t.next;
            }
             
            return true;
        }
    }
}
