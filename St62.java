
public class St62 {
	public static void main(String[] args) throws Exception {
        String str = "goodnight";
        String s = "good";
        System.out.println("The given strings is: " + str);
        if (str.length() == s.length())
            System.out.println(str.equals(s));
        else if (str.length() > s.length())
            System.out.println(str.substring(0, 4).equals(s) ||
                               str.substring(1, 5).equals(s));
        else
            System.out.println(false);

    }
}
