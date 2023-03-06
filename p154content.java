public class NP4content {
	public static void main(String[] args) {
        boolean[][] array = {{true, false, true}, {false, true, false}};

        for (int i = 0; i < array.length; i++){
            for (int j = 0; j < array[0].length; j++){
                if (array[i][j])
                    System.out.print(" t ");
                else
                    System.out.print(" f ");
            }
            System.out.println();
        }
    }
}

