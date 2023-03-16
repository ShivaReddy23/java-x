import java.util.ArrayList;
	import java.util.Collections;
	import java.util.List;
public class p207asc {
	
	static class Node {
        int key;
        Node next;
    };
    static Node reverseList(Node head)
    { if (head.next == null)
            return head;
 
        Node rest = reverseList(head.next);
        head.next.next = head;
        head.next = null;
 
        return rest;
    }
    static Node sortedMerge(Node a, Node b)
    {
        a = reverseList(a);
        b = reverseList(b);
        Node head = null;
 
        Node temp;
        while (a != null && b != null) {
            if (a.key >= b.key) {
                temp = a.next;
                a.next = head;
                head = a;
                a = temp;
            }
            else {
 
                temp = b.next;
                b.next = head;
                head = b;
                b = temp;
            }
        }
        while (a != null) {
 
            temp = a.next;
            a.next = head;
            head = a;
            a = temp;
        }
        while (b != null) {
 
            temp = b.next;
            b.next = head;
            head = b;
            b = temp;
        }
        return head;
    }
    static void printList(Node Node)
    {
        while (Node != null) {
            System.out.print(Node.key + " ");
            Node = Node.next;
        }
    }
    static Node newNode(int key)
    {
        Node temp = new Node();
        temp.key = key;
        temp.next = null;
        return temp;
    }
    public static void main(String[] args)
    {
        Node res = null;
        Node a = newNode(3);
        a.next = newNode(4);
        a.next.next = newNode(5);
        a.next.next.next = newNode(7);
 
        Node b = newNode(1);
        b.next = newNode(2);
        b.next.next = newNode(6);
        res = sortedMerge(a, b);
 
        System.out.println("Merged Linked List is:");
        printList(res);
    }
}
