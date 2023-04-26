import java.util.TreeSet;
	import java.util.Iterator;
public class TS6 {
	  public static void main(String[] args) {
	     TreeSet<String> t_set = new TreeSet<String>();
	          t_set.add("Red");
	          t_set.add("Green");
	          t_set.add("Black");
	          t_set.add("Pink");
	          t_set.add("orange");
	     
	   System.out.println("Original tree set:" + t_set);  
	    TreeSet<String> new_t_set = (TreeSet<String>)t_set.clone();
	          System.out.println("Cloned tree list: " + t_set);      
	     }
}
