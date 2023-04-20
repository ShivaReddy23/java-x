
public class St66 {
	public static void main(String[] args) throws Exception {
        String str1 = "goat";
        System.out.println("The given strings is: " + str1);
        System.out.println("The new string is: " + newStr(str1));

        String str2 = "photo";
        System.out.println("\nThe given strings is: " + str2);
        System.out.println("The new string is: " + newStr(str2));

        String str3 = "ghost";
        System.out.println("\nThe given strings is: " + str3);
        System.out.println("The new string is: " + newStr(str3));
    }
    public static String newStr(String s){
        String sr = "";
        if (s.charAt(0) == 'g')
            sr += "g";
        if (s.charAt(1) == 'h')
            sr += "h";
        return sr + s.substring(2);
    }
}
