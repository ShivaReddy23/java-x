
public class St60 {
	public static void main(String[] args) throws Exception {
        String str1 = "Welcome";
        String str2 = "home";
        System.out.println("The given strings is: "+str1+" and "+str2);
        int len1 = str1.length();
        int len2 = str2.length();
        if (len1 > len2){
            str1 = str1.substring(len1 - len2);
        } else {
            str2 = str2.substring(len2-len1);
        }
        System.out.println("The new string is: " + str1+str2);

    }
}
