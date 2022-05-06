public class random {

   public static boolean isNonZero(int[][] array2D, int r) {

      for (int j = 0; j < array2D[0].length; j++) {
         if (array2D[r - 1][j] == 0) {
            return false;
         }

      }
      return true;

   }
   public static void main(String[] args) {

   }
}