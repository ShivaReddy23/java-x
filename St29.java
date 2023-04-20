
public class St29 {
	public static void main(String[] arg) {
		String str = "The Quick BroWn FoX!";
		System.out.println("the original: "+str);
		convert_to_lower_case(str);
		convert_to_upper_case(str);
		}

		public static void convert_to_lower_case(String str) {
		System.out.println("lower case: "+str.toLowerCase());
		}
		public static void convert_to_upper_case(String str) {
		System.out.println("upper case: "+str.toUpperCase());
		}
		}
