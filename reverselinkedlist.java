import java.util.* ;
import java.io.*; 
/*
	Following is the structure of the Singly Linked List.	
	class LinkedListNode<T> 
    {
    	T data;
    	LinkedListNode<T> next;
    	public LinkedListNode(T data) 
        {
        	this.data = data;
    	}
	}

*/
public class Solution 
{
    public static LinkedListNode<Integer> reverseLinkedList(LinkedListNode<Integer> head) 
    {
        // Write your code here!
        LinkedListNode<Integer> prev=null,cur=head;
        while(cur!=null)
        {
            LinkedListNode<Integer>nn=cur.next;
            cur.next=prev;
            prev=cur;
            cur=nn;
        }
        return prev;
    }
}
