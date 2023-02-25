import java.util.*;
public class p48index {
	
	  public static void First_Uniq_Char(String s)
	  {
	 
	    for (int i = 0; i < s.length(); i++) {
	 
	      if (s.indexOf(s.charAt(i), s.indexOf(s.charAt(i)) + 1) == -1) {
	        System.out.println("First unique character is "+ s.charAt(i));
	        System.out.println("Original String: "+s);
	        break;
	      }
	    }
	    return;
	  }
	  public static void main (String[] args) {
	    String s = "wresource";
	    First_Uniq_Char(s);
	  }
	}