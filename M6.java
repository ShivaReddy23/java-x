import java.util.Scanner;
public class M6 {
	public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        System.out.print("Input an integer: ");
        int num = input.nextInt();
        System.out.println("The sum is " + sumDigit(num));
    }
    public static int sumDigit(int s){
        int sum = 0;
        while (s > 0){
            sum += s % 10;
            s /= 10;
        }
        return sum;
    }
}
