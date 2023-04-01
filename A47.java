
public class A47 {
    public static void main (String[] args) {
        int arr_int[] = {35, 32, 30, 14, 18, 21, 27};
        int index = -1;
        for (int i = 0; i < arr_int.length-1; i++){
            if (arr_int[i] < arr_int[i+1]) {
                index = i;
                break;
            }
        }
        System.out.println(index);
    }
}
