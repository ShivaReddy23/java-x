
public class St52 {
	public static void main (String[] arg){

		String str = "ABACD";
		String str1 = "CDABA";
		String new_str = str+str;
		System.out.println("The concatination of 1st string twice is: "+new_str);
		if (new_str.contains(str1)){
		System.out.println("The 2nd string "+ str1 +" exists in the new string.");

		System.out.println("Strings are rotations of each other");
		}
		else{
		System.out.println("The 2nd string "+ str1 +" does not exist in the new string.");
		System.out.println("Strings are not rotations of each other");
		}

		}
}
