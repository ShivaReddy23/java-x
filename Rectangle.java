import java.util.Scanner;
public class Rectangle {
	public static void main(String[] args) 
    {
        int w, h, perimeter, area;
        Scanner s = new Scanner(System.in);
        
        System.out.print("Enter Width of rectangle:");
       w = s.nextInt();
  System.out.print("Enter Height of rectangle:");
        h = s.nextInt();
      area = w * h;   
      perimeter = 2 * (w + h);
      System.out.println("Area is " + w + " * " + h+ " = " + area);
      System.out.println("Perimeter is 2 * ("+ w + " + " + h+")" + " = " + perimeter);

      }
      }