public class Formula {
	public static void main(String[] args) {
		double divisor = 1,dividend = 1;
		double output=0;

		for(int x=0;x<=5;x++){
		if(x%2==0){
		output=output+(dividend/divisor);
		}else{
		output=output-(dividend/divisor);
		}
		divisor +=2;
		}
		System.out.println("the answer is "+4.0*output);
		}
}