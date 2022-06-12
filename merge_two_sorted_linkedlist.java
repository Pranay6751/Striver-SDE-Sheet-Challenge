import java.util.* ;
import java.io.*; 
/************************************************************

    Following is the linked list node structure:
    
    class LinkedListNode<T> {
        T data;
        LinkedListNode<T> next;

        public LinkedListNode(T data) {
            this.data = data;
        }
    }

************************************************************/

public class Solution {
	public static LinkedListNode<Integer> sortTwoLists(LinkedListNode<Integer> first, LinkedListNode<Integer> second) {
		// Write your code here.
        LinkedListNode<Integer>f1=new LinkedListNode<Integer>(-1);
        LinkedListNode<Integer>cur=f1;
        while(first!=null && second!=null)
        {
            if(first.data<=second.data)
            {
                f1.next=first;
                f1=f1.next;
                first=first.next;
            }
            else
            {
                f1.next=second;
                f1=f1.next;
                second=second.next;
            }
        }
        if(first!=null) f1.next=first;
        if(second!=null) f1.next=second;
        return cur.next;
	}
}











