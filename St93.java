
public class St93 {
	public static void main(String[] args) throws Exception {
        String str = "playersplay";
        System.out.println("The given string is: " + str);

        int j = 0;
        int len = str.length()/2;
        for (int i = len; i < str.length(); i++){
            if ( j < len) {
                if (str.charAt(i) == str.charAt(j))
                    j++;
                else if (j > 0) {
                    j = 0;
                    i--;
                }
            }
        }
        System.out.println("The longest substring in the string is: " + str.substring(0, j));
    }
}
