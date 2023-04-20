
public class St90 {
	public static void main(String[] args) throws Exception {
        String str = "Thisisthethesis";
        System.out.println("The given string is: " + str);
        
        int cThe = 0;
        int cIs = 0;
        int len = str.length();
        for (int i = 0; i < len; i++){
            if (i+2 <= len && str.substring(i, i+2).equals("is"))
                cIs ++;
            if (i+3 <= len && str.substring(i, i+3).equals("the"))
                cThe ++;
        }
        System.out.println("Are the appearance of 'the' and 'is' equal? " + (cIs == cThe));
    }
}
