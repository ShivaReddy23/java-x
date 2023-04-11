import java.util.Scanner;
public class S19 {
	  private int[] arr;
	  private int top;
	  public S19(int size) {
	    arr = new int[size];
	    top = -1;
	  }
	  public void push(int num) {
	    if (top == arr.length - 1) {
	      System.out.println("Stack is full");
	    } else {
	      top++;
	      arr[top] = num;
	    }
	  }
	  public int pop() {
	    if (top == -1) {
	      System.out.println("Stack Underflow");
	      return -1;
	    } else {
	      int poppedElement = arr[top];
	      top--;
	      return poppedElement;
	    }
	  }
	  public int peek() {
	    if (top == -1) {
	      System.out.println("Stack is empty");
	      return -1;
	    } else {
	      return arr[top];
	    }
	  }
	  public boolean isEmpty() {
	    return top == -1;
	  }
	  public int getSize() {
	    return top + 1;
	  }

	  public static boolean isSubset(S19 A, S19 B) {
		  S19 temp = new S19(A.getSize()); // create a temporary stack for A    
	    boolean isSubset = true;
	    while (!A.isEmpty()) {
	      int a = A.pop();
	      boolean found = false;
	      while (!B.isEmpty()) {
	        int b = B.pop();

	        if (a == b) {
	          found = true;
	          break;
	        } else {
	          temp.push(b);
	        }
	      }
	      while (!temp.isEmpty()) {
	        B.push(temp.pop());
	      }
	      if (!found) {
	        isSubset = false;
	        break;
	      }
	    }
	    while (!temp.isEmpty()) {
	      A.push(temp.pop());
	    }

	    return isSubset;
	  }
	  public void display() {
	    if (top == -1) {
	      System.out.println("Stack is empty");
	    } else {
	      System.out.print("Stack elements: ");
	      for (int i = top; i >= 0; i--) {
	        System.out.print(arr[i] + " ");
	      }
	      System.out.println();
	    }
	  }

	  public static void main(String[] args) {
	    System.out.println("Initialize a stack:");
	    System.out.println("\nStack-A");
	    S19 A = new S19(5);
	    A.push(1);
	    A.push(2);
	    A.push(3);
	    A.display();
	    S19 B = new S19(5);
	    B.push(5);
	    B.push(4);
	    B.push(3);
	    B.push(2);
	    B.push(1);
	    System.out.println("\nStack-B");
	    B.display();
	    System.out.println("\nCheck Stack A is subset of Stack B!");
	    System.out.println(isSubset(A, B));
	    System.out.println("\nCheck Stack B is subset of Stack A!");
	    System.out.println(isSubset(B, A));
	  }
	}