import java.util.*;
public class p41check {
	
	    boolean uniqueCharacters(String str)
	    {
	        char[] chArray = str.toCharArray();
	        Arrays.sort(chArray);
	 
	        for (int i = 0; i < chArray.length - 1; i++) {
	           
	            if (chArray[i] != chArray[i + 1])
	                continue;
	            else
	                return false;
	        }
	        return true;
	    }
	    public static void main(String args[])
	    {
	        p41check obj = new p41check();
	        String input = "xyyz";
	 
	        if (obj.uniqueCharacters(input))
	            System.out.println("The String " + input
	                               + " has all unique characters");
	        else
	            System.out.println("The String " + input
	                               + " has duplicate characters");
	    }
	}
