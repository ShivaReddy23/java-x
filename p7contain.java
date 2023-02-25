import java.util.Arrays;
import java.util.HashMap;
public class p7contain {
	static void distinctAdjacentElement(int a[], int n)
	{
	HashMap<Integer,Integer> m = new HashMap<Integer,
	Integer>();
	for (int i = 0; i < n; ++i){
	 
	if(m.containsKey(a[i])){
	int x = m.get(a[i]) + 1;
	m.put(a[i],x);
	}
	else{
	m.put(a[i],1);
	}
	 
	}
	int mx = 0;
	 
	for (int i = 0; i < n; ++i)
	if (mx < m.get(a[i]))
	mx = m.get(a[i]);
	 
	if (mx > (n + 1) / 2)
	System.out.println("False");
	else
	System.out.println("True");
	}
	public static void main (String[] args) {
	int a[] = { 7, 7, 7 ,3,3};
	int n = 5;
	distinctAdjacentElement(a, n);
	}
	}

		  
		

