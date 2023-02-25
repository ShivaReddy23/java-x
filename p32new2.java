import java.util.ArrayList;
	import java.util.Arrays;
	import java.util.HashMap;
	import java.util.List;
	import java.util.Map;
public class p32new2 {
	
	public static void removeDuplicates(int[] arr, int n) {
	   
	    List<Integer> l = new ArrayList<>();
	    Map<Integer, Integer> freq = new HashMap<>();
	    for (int i = 0; i < n; i++) {
	        if (freq.containsKey(arr[i])) {
	            freq.put(arr[i], freq.get(arr[i]) + 1);
	        } else {
	            freq.put(arr[i], 1);
	        }
	    }
	 
	    for (int i = 0; i < n; i++) {
	        if (freq.get(arr[i]) >= 2) {
	        
	            freq.put(arr[i], 1);
	            l.add(arr[i]);
	        } else if (freq.get(arr[i]) == 1) {
	         

	            l.add(arr[i]);
	            freq.put(arr[i], 0);
	        }
	    }
	 
	    for (int i : l) {
	        System.out.print(i + " ");
	    }
	}
	 
	public static void main(String[] args) {
	    int[] arr = {1, 1, 2, 3, 3, 3, 4, 5, 6, 7, 7, 7, 7};
	    int n = arr.length;
	 
	    removeDuplicates(arr, n);
	}
	 
	}

