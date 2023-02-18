public class Display1 {
	public static void main(String args[]){

		char[] a={'1','2','3','4'};
		String s="";int count=0;
		for(int i=120;i<500;i++){
		s=String.valueOf(i);
		for(int j:a){
		if(s.charAt(0)==j)count++;
		else if(s.charAt(1)==j)count++;
		else if(s.charAt(2)==j)count++;
		}
		if(count==3)System.out.println(i);
		count=0;
		}
		}
		}
