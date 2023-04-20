
public class St95 {
	public static void main(String[] args) throws Exception {
        String str = "ab5c2d4ef12s";
        System.out.println("The given string is: " + str);

        int sum = 0;
        for (int i = 0; i < str.length(); i++){
            char ch = str.charAt(i);
            if (ch >= '0' && ch <= '9') {
                String c = ch + "";
                sum += Integer.parseInt(c);
            }
        }
        System.out.println("The sum of the digits in the string is: " + sum);
    }
}
