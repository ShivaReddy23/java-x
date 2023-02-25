import java.io.*;
public class p35remove {
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
	    void removeDuplicates()
	    {
	        Node temp = head, prev = head;
	 
	        while (temp != null) {
	 
	            if (temp.data != prev.data) {
	                
	                prev.next = temp;
	                prev = temp;
	            }
	            temp = temp.next;
	        }
	        if (prev != temp)
	            prev.next = null;
	    }
	    public void push(int new_data)
	    {
	        Node new_node = new Node(new_data);
	        new_node.next = head;
	        head = new_node;
	    }
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
	        p35remove llist = new p35remove();
	        llist.push(12);
	        llist.push(12);
	        llist.push(13);
	        llist.push(14);
	        llist.push(15);
	        llist.push(15);
	        llist.push(16);
	        llist.push(17);
	        llist.push(17);
	 
	        System.out.print("List before ");
	        System.out.println("removal of duplicates");
	        llist.printList();
	 
	        llist.removeDuplicates();
	 
	        System.out.println(
	            "List after removal of elements");
	        llist.printList();
	    }
	}

