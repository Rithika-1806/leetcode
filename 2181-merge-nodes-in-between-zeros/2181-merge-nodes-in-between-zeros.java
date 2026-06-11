/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode mergeNodes(ListNode head) {
        ListNode dummy=new ListNode(0);
        ListNode temp1=dummy;
        ListNode temp=head.next;
        ArrayList<Integer> list=new ArrayList<>();
        Stack<Integer>st=new Stack<>();
        while(temp!=null){
           int sum=0;
            while(temp!=null && temp.val!=0){
                st.push(temp.val);
                temp=temp.next;
            }
            while(!st.isEmpty()){
                sum+=st.pop();
            }
            list.add(sum);
            temp=temp.next;
        }

        for(int i=0;i<list.size();i++){
            temp1.next=new ListNode(list.get(i));
            temp1=temp1.next;
            
        }
        return dummy.next;
    }
}