
public class A46 {
	    public static void main (String[] args) {
	        int arr_int[] = {22, 25, 17, 18, 19, 20};
	        int sum = 42;
	        int n = arr_int.length;
	        boolean flag = false;
	        for (int i = 0; i < n-1; i++){
	            for (int j = i+1; j < n; j++){
	                if (arr_int[i] + arr_int[j] == sum) {
	                    flag = true;
	                    break;
	                }
	            }
	            if (flag) break;
	        }
	        if (flag)
	            System.out.println("Array has a pair of elements with sum 42.");
	        else
	            System.out.println("Array has no pair with sum 42.");
	    }
	}

