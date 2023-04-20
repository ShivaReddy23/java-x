public class St75 {
	public static void main (String[] arg){

		String str = "xxxabcxxxxx" ;
		String str_sub ="abc";
		String str2 = "xxabcxxx";
		System.out.println("The given string is: "+str);
		System.out.println("Is abc appear in middle? "+string_is_middle(str,str_sub)+"\n");
		System.out.println("The given string is: "+str2);
		System.out.println("Is abc appear in middle? "+string_is_middle(str2,str_sub));

		}
		static boolean string_is_middle (String str , String str_sub){
		int x = str.substring(0, str.indexOf(str_sub.charAt(0))).length()-str.substring( str.indexOf(str_sub.charAt(0))+3).length();
		boolean m=false;
		if (Math.abs(x)==1||Math.abs(x)==0){
		m =true;
		}

		return m;
		}
}
