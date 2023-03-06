import java.io.*;
public class p80swap {
	//class LinkedList {
	    Node head;
	     class Node {
	         int data;
	         Node next;
	         Node(int d)
	         {
	             data = d;
	             next = null;
	         }
	     }
	  
	     void pairWiseSwap()
	     {
	         Node temp = head;
	  
	         while (temp != null && temp.next != null) {
	  
	             /* Swap the data */
	             int k = temp.data;
	             temp.data = temp.next.data;
	             temp.next.data = k;
	             temp = temp.next.next;
	         }
	     }
	  
	     public void push(int new_data)
	     {
	         Node new_node = new Node(new_data);
	  
	         new_node.next = head;
	  
	         head = new_node;
	     }
	  
	     /* Function to print linked list */
	     void printList()
	     {
	         Node temp = head;
	         while (temp != null) {
	             System.out.print(temp.data + " ");
	             temp = temp.next;
	         }
	         System.out.println();
	     }
	     public static void main(String args[])
	     {
	    	 p80swap llist = new p80swap();
	  
	         llist.push(50);
	         llist.push(40);
	         llist.push(30);
	         llist.push(20);
	         llist.push(10);
	  
	         System.out.println("Linked List before calling pairWiseSwap() ");
	         llist.printList();
	  
	         llist.pairWiseSwap();
	  
	         System.out.println("Linked List after calling pairWiseSwap() ");
	         llist.printList();
	     }
	 }
