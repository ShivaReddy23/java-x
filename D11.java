public class D11 {
		   public static void main(String[] args) {
		      float value1 = (float) 1 / 0;
		      boolean res1 = Float.isInfinite(value1);
		      System.out.println("Checking for isInfinite? = "+res1);
		      float value2 = (float) Math.sqrt(9);
		      boolean res2 = Float.isNaN(value2);
		      System.out.println("Checking for isNan? = "+res2);
		   }
		}

