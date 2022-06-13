import java.util.* ;
import java.io.*; 
/****************************************************************

    Following is the class structure of the Node class:

    class LinkedListNode {
        int data;
        LinkedListNode next;
        
        public LinkedListNode(int data) {
            this.data = data;
        }
    }

*****************************************************************/


public class Solution {
    static LinkedListNode addTwoNumbers(LinkedListNode a, LinkedListNode b) {
        // Write your code here.
                int carry=0;
        LinkedListNode dummy=new LinkedListNode(-1);
        LinkedListNode temp=dummy;
        while(a!=null && b!=null)
        {
            int add=a.data+b.data+carry;
            LinkedListNode nn=new LinkedListNode(add%10);
            temp.next=nn;
            temp=temp.next;
            carry=add/10;

            a=a.next;
            b=b.next;
        }
        while(a!=null)
        {
            int add=a.data+carry;
            LinkedListNode nn=new LinkedListNode(add%10);
            temp.next=nn;
            temp=temp.next;
            carry=add/10;

            a=a.next;
        }
        while(b!=null)
        {
            int add=b.data+carry;
            LinkedListNode nn=new LinkedListNode(add%10);
            temp.next=nn;
            temp=temp.next;
            carry=add/10;

            b=b.next;
        }
        if(carry!=0)
        {
            LinkedListNode nn=new LinkedListNode(carry);
            temp.next=nn;
            temp=temp.next;
        }
        return (dummy.next);
    }
    public LinkedListNode reverseList(LinkedListNode head) {
        
        
        if(head==null || head.next==null) return head;
        
        LinkedListNode prev=null,cur=head;
        while(cur!=null)
        {
            LinkedListNode t=cur.next;
            cur.next=prev;
            prev=cur;
            cur=t;
        }
        return prev;
    }
}
