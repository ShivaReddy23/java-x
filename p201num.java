public class p201num {
	static int KpartitionsPossible(int arr[], int n, int k) {
        int sum = 0;
        int count = 0;
        for (int i = 0; i < n; i++) {
            sum = sum + arr[i];
        }
 
        if (sum % k != 0) {
            return 0;
        }
 
        sum = sum / k;
        int ksum = 0;
        for (int i = 0; i < n; i++) {
            ksum = ksum + arr[i];
            if (ksum == sum) {
                ksum = 0;
                count++;
            }
 
        }
 
        if (count == k) {
            return 1;
        } else {
            return 0;
        }
 
    }
    public static void main(String[] args) {
 
        int arr[] = {1, 3, 3, 5, 6, 6};
        int k = 4;
        int n = arr.length;
 
        if (KpartitionsPossible(arr, n, k) == 0) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }
    }
 
}


