import java.util.TreeSet;
public class p73med {

	static void printKMax(int arr[], int N, int K)
    {
        int j, max;
  
        for (int i = 0; i <= N - K; i++) {
  
            max = arr[i];
  
            for (j = 1; j < K; j++) {
                if (arr[i + j] > max)
                    max = arr[i + j];
            }
            System.out.print(max + " ");
        }
    }
    public static void main(String args[])
    {
        int arr[] = { 1, 2, 3, 4, 5, 6, 7, 8, 8 };
        int K = 2;
        printKMax(arr, arr.length, K);
    }

	}

