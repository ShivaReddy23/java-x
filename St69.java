
public class St69 {
	public static void main(String[] args) throws Exception {
        String str1 = "sweettoastbuttertoast";
        System.out.println("The given strings is: " + str1);
        System.out.println("The new string is: " + newStr(str1));
    }
    public static String newStr(String s){
        int start = -1;
        int end = -1;
        for (int i = 4; i < s.length(); i++){
            if (s.substring(i-4, i+1).equals("toast"))
                if (start == -1)
                    start = i+1;
                else
                    end = i-4;
        }
        if (start == -1 || end == -1)
            return "mession feild";
        return s.substring(start, end);
    }
}
