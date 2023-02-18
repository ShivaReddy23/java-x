import java.util.Scanner;
public class Circle {
	public static void main(String[] args)

	{

	Scanner sc= new Scanner (System.in) ;

	System.out.println("Enter the radius of the circle: ") ;

	double radius= sc. nextDouble();

	double circumference=2*Math.PI*radius;

	double area= Math. PI*radius*radius;

	System.out.println("The circle with radius"+radius+" has an area of : "+area) ;

	System.out.println("The circle with radius"+radius+" has a circumference of : "+circumference) ;

	}

	}