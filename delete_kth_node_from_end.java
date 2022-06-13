import java.util.* ;
import java.io.*; 
/****************************************************************
	
	Following is the structure of the Singly Linked List.
	
	class LinkedListNode<T> {
    	T data;
    	LinkedListNode<T> next;

    	public LinkedListNode(T data) {
        	this.data = data;
    	}
	}

****************************************************************/

public class Solution {
	public static LinkedListNode<Integer> removeKthNode(LinkedListNode<Integer> head, int K) {
		// Write your code here.
        if(K==0) return head;
        K=K-1;
        if(head==null) return head;
        LinkedListNode<Integer>cur=head;
        int i=0;
        while(i<K && cur!=null)
        {
            cur=cur.next;
            i++;
        }
        if(cur==null) return null;
        LinkedListNode<Integer>s=head,prev=null;
        while(cur.next!=null)
        {
            cur=cur.next;
            prev=s;
            s=s.next;
        }
        
        if(prev==null) return s.next;
        prev.next=s.next;
        return head;
	}
}









