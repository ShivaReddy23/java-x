public class p19element {
	public static void findFirst(int arr[], int x)
    {
        int n = arr.length;
        int first = -1;
        for (int i = 0; i < n; i++) {
            if (x != arr[i])
                continue;
            if (first == -1)
                first = i;
        }
        if (first != -1) {
            System.out.println("First Occurrence = "
                               + first);
        }
        else
            System.out.println("Not Found");
    }
 
    public static void main(String[] args)
    {
        int arr[] = { 1, 2, 2, 2, 2, 3, 4, 7, 8, 8 };
        int x = 1;
        findFirst(arr, x);
    }
}
