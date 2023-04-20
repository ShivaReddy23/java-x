
public class St74 {
	public static void main(String[] args){
		String str="MrsJemsmrsam";
		System.out.println("The given strings is: "+str);
		System.out.println("The prefix string length is: "+str.substring(0,3).length());
		System.out.print("Is 'Mrs' appear else where in the string? ");
		System.out.println((str.substring(3).contains("Mrs"))? true: false);
		}
}
