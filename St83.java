
public class St83 {
	public static void main(String[] args) throws Exception {
        String str1 = "welcome";
        String str2 = "shivani";
        System.out.println("The given strings are: " + str1 + " and " + str2);

        int len1 = str1.length();
        int len2 = str2.length();
        int maxLen = Math.max(len1, len2);

        String s = "";
        for (int i = 0; i < maxLen; i++){
            if (i < len1)
                s += str1.charAt(i);
            if (i < len2)
                s += str2.charAt(i);
        }
        System.out.println("The new string is: " + s);
    }
}
