
public class St41 {
	public static void main(String[] args) throws Exception {
        String gStr = "the quick brown fox";
        System.out.println("The given string is: " + gStr);

        String maskStr = "queen";
        System.out.println("The given mask string is: " + maskStr);

        String result = "";
        for (int i = 0; i < gStr.length(); i++){
            String chr = String.valueOf(gStr.charAt(i));
            if ( !maskStr.contains(chr)){
                result += chr;
            }
        }
        System.out.println("\nThe new string is:\n" + result);
	}
}
