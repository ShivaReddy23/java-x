
public class M9 {
	 public static void main(String[] args) throws Exception {
	        char from = '(';
	        char to = 'z';
	        int num = 20;
	        charsBetween(from, to, num);
	        }

	    public static void charsBetween(char a, char b, int n) {

	        for (int i = a+1; i <= b+1; i++){
	            System.out.print(((char) (i-1)) + "  ");
	            if (i % n == 0)
	                System.out.println();
	        }
	    }
}
