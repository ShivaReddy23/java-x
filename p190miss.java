import java.util.*;
public class p90miss {
	
	public static void main(String args[]) {
        try {
                   String  s1  = "my.solution.";
                   String  s2 = "your. problem.";
            String arr1[] = s1.split(" ");
            String arr2[] = s2.split(" ");
            java.util.List<String> list1 = new ArrayList<String>(
                    Arrays.asList(arr1));
            java.util.List<String> list2 = new ArrayList<String>(
                    Arrays.asList(arr2));

            ArrayList<String> tmp1 = new ArrayList<String>();
            ArrayList<String> tmp2 = new ArrayList<String>();

            for (int i = 0; i < arr1.length; i++) {
                int k = 0;
                for (int j = 0; j < arr2.length; j++) {

                    if (arr1[i].equalsIgnoreCase(arr2[j])) {
                        tmp1.add(arr1[i]);
                    } else {
                        tmp2.add(arr1[i]);
                    }

                }

            }
            for (String strs : tmp1) {
                list1.remove(strs);
            }

            System.out.print(list1.toString());

    }catch(Exception e)
    {
        e.printStackTrace();
    }
}
}
	

