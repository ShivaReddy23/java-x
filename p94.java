public class p94 {
	static void printTheArray(int arr[], int N)
	{
	  for (int i = 0; i < N; i++)
	   System.out.print(arr[i] + " ");
	}
	 static void rearrange(int arr[], int N)
	{
	  if ((N & 1) != 0)
	    N--;
	  int odd = 1, even = 0;
	 
	  int i, m = arr[N - 1] + 1;
	 
	  for (i = 0; i < N / 2; i++) {
	    arr[i] += (arr[odd] % m) * m;
	 
	    odd += 2;
	  }
	  for (; i < N; i++) {
	 
	    arr[i] += (arr[even] % m) * m;
	 
	    even += 2;
	  }
	  for (i = 0; i < N; i++) {
	 
	    arr[i] = arr[i] / m;
	  }
	}
	public static void main (String[] args)
	{
	     int arr[] = { 1, 2, 3, 4, 5, 16, 18, 19 };
	    int N = arr.length;
	   
	    rearrange(arr, N);
	    printTheArray(arr, N);
	 
	}
}
