
public class St80 {
	public static void main(String[] args) throws Exception {
        String str1 = "moon#night";
        System.out.println("The given string is: " + str1);
        System.out.println("The before and after character are same: " + bfAfSame(str1));

        String str2 = "bat##ball";
        System.out.println("\nThe given string is: " + str2);
        System.out.println("The before and after character are same: " + bfAfSame(str2));

        String str3 = "#moon#night";
        System.out.println("\nThe given string is: " + str3);
        System.out.println("The before and after character are same: " + bfAfSame(str3));

    }
    public static boolean bfAfSame(String s){
        for (int i = 1; i < s.length()-1; i++){
            if (s.charAt(i) == '#' &&
                s.charAt(i-1) == s.charAt(i+1))
                return true;
        }
        return false;
    }
}
