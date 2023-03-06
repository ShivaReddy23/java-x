public class p72num {
	 public static void main(String[] args) {

	        int[] array = {1, 2, 3, 4, 5, 6, 7, 8};
	        int[] smallerThanArray = {1, 4, 8};

	        for (int i = 0; i < smallerThanArray.length; i++){
	            int count = 0;
	            for (int j = 0; j < array.length; j++){
	                if (array[j] < smallerThanArray[i]){
	                    count++;
	                }
	            }
	            System.out.println(count);
	        }
	    }
	}
		
