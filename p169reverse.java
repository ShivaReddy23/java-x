public class p69reverse {
		 
	    public static void main(String[] args)
	    {
	        String s[]
	            = "The quick brown fox jumps over the lazy dog".split(" ");
	        String ans = "";
	        for (int i = s.length - 1; i >= 0; i--) {
	            ans += s[i] + " ";
	        }
	         
	        System.out.println(
	            ans.substring(0, ans.length() - 1));
	    }
	}

