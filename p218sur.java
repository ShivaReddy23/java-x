import java.text.*;
public class p218sur {
	static void findCircle(int x1, int y1,
	                        int x2, int y2,
	                        int x3, int y3)
	{
	    int x12 = x1 - x2;
	    int x13 = x1 - x3;
	 
	    int y12 = y1 - y2;
	    int y13 = y1 - y3;
	 
	    int y31 = y3 - y1;
	    int y21 = y2 - y1;
	 
	    int x31 = x3 - x1;
	    int x21 = x2 - x1;
	 
	    // x1^2 - x3^2
	    int sx13 = (int)(Math.pow(x1, 2) -
	                    Math.pow(x3, 2));
	 
	    // y1^2 - y3^2
	    int sy13 = (int)(Math.pow(y1, 2) -
	                    Math.pow(y3, 2));
	 
	    int sx21 = (int)(Math.pow(x2, 2) -
	                    Math.pow(x1, 2));
	                     
	    int sy21 = (int)(Math.pow(y2, 2) -
	                    Math.pow(y1, 2));
	 
	    int f = ((sx13) * (x12)
	            + (sy13) * (x12)
	            + (sx21) * (x13)
	            + (sy21) * (x13))
	            / (2 * ((y31) * (x12) - (y21) * (x13)));
	    int g = ((sx13) * (y12)
	            + (sy13) * (y12)
	            + (sx21) * (y13)
	            + (sy21) * (y13))
	            / (2 * ((x31) * (y12) - (x21) * (y13)));
	 
	    int c = -(int)Math.pow(x1, 2) - (int)Math.pow(y1, 2) -
	                                2 * g * x1 - 2 * f * y1;
	    int h = -g;
	    int k = -f;
	    int sqr_of_r = h * h + k * k - c;
	    double r = Math.sqrt(sqr_of_r);
	    DecimalFormat df = new DecimalFormat("#.#####");
	    System.out.println("Centre = (" + h + "," + k + ")");
	    System.out.println("Radius = " + df.format(r));
	}
	public static void main (String[] args)
	{
	    int x1 = 5, y1 = 6;
	    int x2 = 4, y2 = 8;
	    int x3 = 7, y3 = 9;
	    findCircle(x1, y1, x2, y2, x3, y3);
	}
	}

