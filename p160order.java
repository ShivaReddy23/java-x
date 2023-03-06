import java.io.*;
	import java.util.*;
public class NP10order {
	public static void main(String[] args) {
        int[] array = {1, 4, 17, 7, 25, 3, 100};
        System.out.println("Original Array:\n[1, 4, 17, 7, 25, 3, 100]");
        System.out.println("3 smallest elements of the said array are:");
        int mini = array[0];
        int h = 0;
        for (int j = 0; j < 3; j++) {
            for (int i = 0; i < array.length; i++) {
                if (array[i] < mini){
                    mini = array[i];
                    h = i;
                }
            }
            System.out.print(mini+" ");
            array[h] = Integer.MAX_VALUE;
            mini = Integer.MAX_VALUE;
        }
    }
}

	 