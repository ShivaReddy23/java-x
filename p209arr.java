import java.util.*;
public class p209arr {
	    static void unique_combination(int l, int sum, int K,
	                                   Vector<Integer> local,
	                                   Vector<Integer> A)
	    {
	        if (sum == K) {
	            System.out.print("{");
	            for (int i = 0; i < local.size(); i++) {
	                if (i != 0)
	                    System.out.print(" ");
	                System.out.print(local.get(i));
	                if (i != local.size() - 1)
	                    System.out.print(", ");
	            }
	            System.out.println("}");
	            return;
	        }
	        for (int i = l; i < A.size(); i++) {
	            if (sum + A.get(i) > K)
	                continue;
	            if (i > l && A.get(i) == A.get(i - 1) )
	                continue;
	            local.add(A.get(i));
	 
	            unique_combination(i + 1, sum + A.get(i), K,
	                               local, A);
	 
	            local.remove(local.size() - 1);
	        }
	    }
	    static void Combination(Vector<Integer> A, int K)
	    {
	        Collections.sort(A);
	 
	        Vector<Integer> local = new Vector<Integer>();
	 
	        unique_combination(0, 0, K, local, A);
	    }
	    public static void main(String[] args)
	    {
	        Integer[] arr = { 2, 3, 4, 5, 6, 7, 8 };
	        Vector<Integer> A
	            = new Vector<>(Arrays.asList(arr));
	 
	        int K = 21;
	 
	        // Function call
	        Combination(A, K);
	    }
	}

