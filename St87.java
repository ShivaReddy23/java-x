
public class St87 {
	public static void main(String[] args) throws Exception {
        String str = "azzlea";

        System.out.println("The given string is: " + str);
        System.out.println("Is z happy in the string: " + isZHappy(str));
    }
    public static boolean isZHappy(String sr){
        boolean flog = false;
        for (int i = 0; i < sr.length(); i++){
            if (sr.charAt(i) == 'z'){
                if (i > 0 && sr.charAt(i-1) == 'z')
                    flog = true;
                else if (i+1 < sr.length() && sr.charAt(i+1) == 'z')
                    flog = true;
                else {
                    flog = false;
                    break;
                }
            }
        }
        return flog;
    }
}
