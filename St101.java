
public class St101 {
	public static void main(String[] args) throws Exception {
        String str1 = "131231231231231231231231231212312312";
        System.out.println("First string:\n" + str1);
        System.out.println(isAllDigit(str1));

        String str2 = "13123123123Z1231231231231231212312312";
        System.out.println("\nSecond string:\n" + str2);
        System.out.println(isAllDigit(str2));
    }
    public static boolean isAllDigit(String s){
        for (int i = 0; i < s.length(); i++){
            if (!(s.charAt(i) >= '0' && s.charAt(i) <= '9'))
                return false;
        }
        return true;
    }
}
