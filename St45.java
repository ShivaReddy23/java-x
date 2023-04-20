
public class St45 {
	public static void main (String[] arg){
		String str = "Reverse words in a given string";
		String[] str_array = str.split(" ");
		String rev ="";
		for (int i =str_array.length-1 ;i>=0 ;i--){
		rev+= str_array[i]+" ";
		}
		System.out.println(rev);

		}
		}