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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {

        ListNode temp = l1;
        ListNode temp1 = l2;

        LinkedList<Integer> result = new LinkedList<>();

        int carry = 0;

        while(temp != null || temp1 != null){

            int sum = carry;

            if(temp != null){
                sum = sum + temp.val;
                temp = temp.next;
            }

            if(temp1 != null){
                sum = sum + temp1.val;
                temp1 = temp1.next;
            }

            result.add(sum % 10);
            carry = sum / 10;
        }
        if(carry>0){
            result.add(carry);
        }
        
        ListNode head = null;
        ListNode tail = null;

        for(int num : result){
            ListNode node = new ListNode(num);

            if(head == null){
                head = node;
                tail = node;
            }else{
                tail.next = node;
                tail = node;
            }

        
    }
    return head;
}
}