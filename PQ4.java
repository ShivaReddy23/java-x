import java.util.PriorityQueue;
public class PQ4 {
	  public static void main(String[] args) {
	           PriorityQueue<String> pq1 = new PriorityQueue<String>(); 
	          pq1.add("Red");
	          pq1.add("Green");
	          pq1.add("Black");
	          pq1.add("White");
	    System.out.println("Original Priority Queue: "+pq1);
	   
	    pq1.offer("Blue");
	 
	    System.out.println("The New Priority Queue: " + pq1);
	  } 
}
