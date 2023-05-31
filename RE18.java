
public class RE18 {
	public static void main(String[] args) {	   
	    String n = "123";
		System.out.println("Original PIN Number: "+n);
		System.out.println("Is the said PIN number is valid? "+validate(n));
	    n = "1234";
		System.out.println("Original PIN Number: "+n);
		System.out.println("Is the said PIN number is valid? "+validate(n));
	    n = "12345";
		System.out.println("Original PIN Number: "+n);
		System.out.println("Is the said PIN number is valid? "+validate(n));	
	    n = "123456";
		System.out.println("Original PIN Number: "+n);
		System.out.println("Is the said PIN number is valid? "+validate(n));
	    n = "1234567";
		System.out.println("Original PIN Number: "+n);
		System.out.println("Is the said PIN number is valid? "+validate(n));	    
		n = "12345678";
		System.out.println("Original PIN Number: "+n);
		System.out.println("Is the said PIN number is valid? "+validate(n));
		n = "123456789";
		System.out.println("Original PIN Number: "+n);
		System.out.println("Is the said PIN number is valid? "+validate(n));		
        }

   public static boolean validate(String n) {
	   return n.matches("\\d{4}|\\d{6}|\\d{8}");
   }
}
