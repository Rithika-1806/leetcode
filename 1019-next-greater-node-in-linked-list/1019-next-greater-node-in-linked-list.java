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
    public int[] nextLargerNodes(ListNode head) {
        ListNode temp=head;
        int count=0;
        while(temp!=null){
            temp=temp.next;
            count++;
        }
        int arr[]=new int[count];
        int j=0;
        temp=head;
        while(temp!=null){
            arr[j]=temp.val;
            j++;
            temp=temp.next;
        }
        Stack<Integer> st=new Stack<>();
        int ans[]=new int[count];
        for(int i=arr.length-1;i>=0;i--){
            while(!st.isEmpty() && st.peek()<=arr[i]){
                st.pop();
            }
            if(st.isEmpty()){
                ans[i]=0;
            }
            else{
                ans[i]=st.peek();
            }
            st.push(arr[i]);
        }
        return ans;
    }
}