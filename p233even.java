import java.util.*;
public class p233even {
	static int MAX = 50000;
	static ArrayList<Integer> primes = new ArrayList<Integer>();
	 
	static void Goldbach()
	{
	    boolean[] marked = new boolean[MAX / 2 + 100];
	 
	    for (int i = 3; i <= (Math.sqrt(MAX) - 1) / 2; i++)
	        for (int j = (i * (i + 1)) << 1; j <= MAX / 2; j = j + 2 * i + 1)
	            marked[j] = true;
	    primes.add(2);
	    for (int i = 1; i <= MAX / 2; i++)
	        if (marked[i] == false)
	            primes.add(2 * i + 1);
	}
	static void findPrimes(int n)
	{
	    if (n <= 2 || n % 2 != 0)
	    {
	        System.out.println("Invalid Input ");
	        return;
	    }
	    for (int i = 0 ; primes.get(i) <= n / 2; i++)
	    {
	        int diff = n - primes.get(i);
	 
	        if (primes.contains(diff))
	        {
	            System.out.println(primes.get(i) +
	                        " + " + diff + " = " + n);
	            return;
	        }
	    }
	}
	public static void main (String[] args)
	{
		Goldbach();
	    findPrimes(4);
	    findPrimes(38);
	    findPrimes(100);
	}
	}