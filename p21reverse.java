import java.util.*;
public class p21reverse {
   
	static LinkedListNode head;   
	  
	static class LinkedListNode   
	{    
	int val;  
	 	
	LinkedListNode next;  
	   
	LinkedListNode(int d)  
	{  

	val = d;  
	next = null;  
	}  
	}  
	   
	public int countNodes(LinkedListNode head)  
	{  
  
	int cnt = 0;  
	while(head != null)  
	{  

	cnt = cnt + 1;  
	   
	head = head.next;  
	}  
	  
	return cnt;  
	}  
	
	public LinkedListNode reverseList(LinkedListNode head, int size)  
	{  
 
	int arr[] = new int[size];  
	    
	for(int i = 0; i < size; i++)  
	{  
	arr[i] = head.val;  
	head = head.next;  
	}  
	int i = size - 1;  
	LinkedListNode head1 = null;  
	 
	while(i >= 0)  
	{  
	      
	if(head1 == null)  
	{  
	head1 = new LinkedListNode(arr[i]);  
	head = head1;  
	}  
	else  
	{   
	head.next = new LinkedListNode(arr[i]);  
	head = head.next;  
	}  
	i = i - 1;  
	  
	}   
	return head1;}
	   
	public void printList(LinkedListNode h)  
	{  
	LinkedListNode t = h;  
	while (t != null)   
	{  
	System.out.print(t.val + " ");  

	t = t.next;  
	}  
	  
	System.out.println();  
	}   
	public static void main(String argvs[])  
	{  
 
		p21reverse listObj = new p21reverse();  
	   
	listObj.head = new LinkedListNode(10);  
	    
	listObj.head.next = new LinkedListNode(20);  
	    
	listObj.head.next.next = new LinkedListNode(30);  
	   
	listObj.head.next.next.next = new LinkedListNode(40);  
	  
	System.out.println("The Linked list before reversal is: ");  
	listObj.printList(head);   
	int size = listObj.countNodes(head);  
	  
	head = listObj.reverseList(head, size);  
	System.out.println(" ");  
	System.out.println("After reversal, the linked list is: ");  
	listObj.printList(head);  
	  
	}  
	}  
