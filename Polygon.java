import java.util.Scanner;
public class polygon{
public static void main(String[] args) {

Scanner in = new Scanner(System.in);

System.out.println("  number of sides in polygon: ");
int n = in.nextInt();

System.out.println(" length of a side  in polygon: ");
double num = in.nextDouble();

System.out.println("polygon: " + (n * (num*num))/(4*Math.tan(Math.PI/n)));

}}