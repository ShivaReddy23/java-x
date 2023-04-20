import java.util.*;
public class St67 {
	public String exceptTwoO(String stng) 
	{
	  String temp = "";
	  for (int i = 0; i < stng.length(); i++) 
	  {
	    if (i == 0 && stng.charAt(i) != 'o')
	      temp += stng.charAt(i);
	    else if (i == 1 && stng.charAt(i) != 'o')
	      temp += stng.charAt(i);
	    else if (i > 1)
	      temp += stng.charAt(i);
	  }
	  return temp;
	}
	public static void main (String[] args)
	    {
		St67 m= new St67();
	      String str1 =  "ooboat";
	      System.out.println("The given strings is: "+str1);
	      System.out.println("The new string is: "+m.exceptTwoO(str1));
		  }
}
