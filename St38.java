import java.util.LinkedHashMap;
public class St37 {
	 static void longestSubstring(String inputString) {
	  char[] arr1 = inputString.toCharArray();
	  String long_str = null;
	  int str_length = 0;
	  LinkedHashMap < Character, Integer >
	  charPosMap = new LinkedHashMap < Character, Integer >();
	  for (int i = 0; i < arr1.length; i++) {
	   char ch = arr1[i];
	   if (!charPosMap.containsKey(ch)) {
	    charPosMap.put(ch, i);
	   } else {
	    i = charPosMap.get(ch);
	    charPosMap.clear();
	   }
	   if (charPosMap.size() > str_length) {
	    str_length = charPosMap.size();
	    long_str = charPosMap.keySet().toString();
	   }
	  }
	  System.out.println("Input String : " + inputString);
	  System.out.println("The longest substring : " + long_str);
	  System.out.println("The longest Substring Length : " + str_length);
	 }
	 public static void main(String[] args) {
	  longestSubstring("pickoutthelongestsubstring");
	  longestSubstring("ppppppppppppp");
	  longestSubstring("Microsoft");  
	 }
	}