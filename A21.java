import java.util.ArrayList;
import java.util.Arrays;
public class A21 {
	public static void  main(String[] args)
	  {
	  ArrayList<String> list = new ArrayList<String>();
	  list.add("Python");
	  list.add("Java");
	  String[]  my_array = new String[list.size()];
	  
	  list.toArray(my_array);
	  
	  for (String  string : my_array)
	  {
	  System.out.println(string);
}}}
