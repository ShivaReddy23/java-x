import java.io.*;
	import java.util.*;
public class NP9array {
	
	public static void kLargest(Integer[] arr, int k)
    {
        Arrays.sort(arr, Collections.reverseOrder());
 
        for (int i = 0; i < k; i++)
            System.out.print(arr[i] + " ");
    }
 
    public static ArrayList<Integer> kLargest(int[] arr,
                                              int k)
    {
        Integer[] obj_array
            = Arrays.stream(arr).boxed().toArray(
                Integer[] ::new);
        Arrays.sort(obj_array, Collections.reverseOrder());
        ArrayList<Integer> list = new ArrayList<>(k);
 
        for (int i = 0; i < k; i++)
            list.add(obj_array[i]);
 
        return list;
    }
    public static void main(String[] args)
    {
        Integer arr[]
            = new Integer[] { 1, 4, 17, 7, 25, 3, 100 };
        int k = 3;
        kLargest(arr, k);
        int[] prim_array = { 1, 4, 17, 7, 25, 3, 100 };
        kLargest(prim_array, k);
    }
}