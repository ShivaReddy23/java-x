public class p78lon {
	static int lis(int arr[], int n)
    {
        int lis[] = new int[n];
        int i, j, max = 0;
 
        for (i = 0; i < n; i++)
            lis[i] = 1;
 
        for (i = 1; i < n; i++)
            for (j = 0; j < i; j++)
                if (arr[i] > arr[j] && lis[i] < lis[j] + 1)
                    lis[i] = lis[j] + 1;
 
        for (i = 0; i < n; i++)
            if (max < lis[i])
                max = lis[i];
 
        return max;
    }
 
    public static void main(String args[])
    {
        int arr[] = { 10, 11, 12, 13, 14, 7, 8, 9, 1, 2, 3 };
        int n = arr.length;
        System.out.println("Length of longest increasing continuous subsequence is " + lis(arr, n) + "\n");
    }
}



