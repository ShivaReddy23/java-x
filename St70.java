
public class St70 {
	public static void main(String[] args) throws Exception {
        String str1 = "gfpmpnppqab";
        System.out.println("The given strings is: " + str1);
        System.out.println("The string is pq-balanced? " + newStr(str1));

        String str2 = "gfpmpnpqpab";
        System.out.println("\nThe given strings is: " + str2);
        System.out.println("The string is pq-balanced? " + newStr(str2));
    }
    public static boolean newStr(String s){
        int p = 0;
        int q = 0;
        for (int i = 0; i < s.length(); i++){
            if (s.charAt(i) == 'p' && p == 0) p++;
            else if (s.charAt(i) == 'q') q++;
            else if (s.charAt(i) == 'p' && q > 0) p++;
        }
        if (p == 1 && q > 0) return true;
        else return false;

    }
}
