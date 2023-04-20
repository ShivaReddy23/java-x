
public class St105 {
    String str = "abcd abc aabc baa abcaa";
    String s = "aa";
    int lenS = s.length();
    int count = 0;{
    for (int i = lenS; i <= str.length(); i++){
        if (str.substring(i-lenS, i).equals(s)) {
            count++;
            i += lenS-1;
        }
    }
    System.out.printf("'%s' has occured %d times in '%s'", s, count, str);
}
}
