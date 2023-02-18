import java.util.Scanner;
public class p84 {
	 public static void main(String[] args)
	 {
		 Scanner sc=new Scanner(System.in);
			String string1=sc.nextLine();
	   
	    int slength = 3;
	    if (slength > string1.length()) {
	      slength = string1.length();
	    }

	    String subpart = string1.substring(string1.length()-3);
	    System.out.println(subpart + string1 + subpart);
	  }
	}