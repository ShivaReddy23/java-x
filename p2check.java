public class P2check {
	public static void main(String[] args) {

	    int[] num = {10,20 , 30, 40, 50};
	    int toFind = 30;
	    boolean found = false;

	    for (int n : num) {
	      if (n == toFind) {
	        found = true;
	        break;
	      }
	    }
	    
	    if(found)
	      System.out.println(toFind + " is found.");
	    else
	      System.out.println(toFind + " is not found.");
	  }
	}

