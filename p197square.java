public class p97square {
	static boolean isPerfectSquare(int x)
    {
        if (x >= 0) {
           
            int sr = (int)Math.sqrt(x);
           
 
            return ((sr * sr) == x);
        }
        return false;
    }
 
    // Driver code
    public static void main(String[] args)
    {
        int x = 6;
 
        if (isPerfectSquare(x))
            System.out.print("Yes");
        else
            System.out.print("No");
    }
}

