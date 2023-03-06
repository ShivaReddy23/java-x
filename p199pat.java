public class p99pat {
	static boolean checkPattern(String str, String pattern)
    {
        int len = pattern.length();
 
        if (str.length() < len)
        {
            return false;
        }
 
        for (int i = 0; i < len - 1; i++)
        {
            char x = pattern.charAt(i);
            char y = pattern.charAt(i + 1);
 
            int last = str.lastIndexOf(x);
 
            int first = str.indexOf(y);
 
            if (last == -1 || first
                    == -1 || last > first)
            {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args)
    {
        String str = "xyyx";
        String pattern = "xxxx";
 
        System.out.println(checkPattern(str, pattern));
    }
}

