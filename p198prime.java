public class p98prime {
	static final int limit = 10000;
	static int []position = new int[limit + 1];
	  
	static void sieve()
	{
	    position[0] = -1;
	    position[1] = -1;
	  
	    int pos = 4;
	    for (int i = 2; i <= limit; i++) {
	        if (position[i] == 0) {
	  
	            position[i] = ++pos;
	            for (int j = i * 2; j <= limit; j += i)
	                position[j] = -1;
	        }
	    }
	}
	public static void main(String[] args)
	{
	    sieve();
	  
	    int n = 3;
	    System.out.print(position[n]);
	}
	}

