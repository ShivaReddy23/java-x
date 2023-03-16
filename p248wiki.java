import java.util.Scanner;
public class p248wiki {
		 public static void main(String[] args) {
		  Scanner scan = new Scanner(System.in);
		  System.out.println("Enter the character :");
		  String input = scan.nextLine();
		  scan.close();
		  int index = input.length() - 1;
		  for (int i = 0; i < index; i++) {
		   if (input.charAt(i) <= input.charAt(i + 1)) {
		    //checking  the word, whether each letter is less than the before letter. 
		   } else {
		    System.out.println("String is not Abecedarian ");
		    return;
		   }
		  }
		  System.out.println("String is  Abecedarian:True ");
		 }
		}

