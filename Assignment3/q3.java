// Shift 0s to the end
public class q3 {
   public static void main(String[] var0) {
      int[] x = {0, 1, 0, 3, 12, 0, 8, 0, 9};
      int[] y = new int[x.length];
      int yindex = 0;
      int nzero = 0;
   

      for(int i = 0; i < x.length; ++i) {
         if (x[i] != 0) {
            y[yindex++] = x[i];
         } else {
            nzero++;
         }
      }

      for(int j= 0; j< nzero; ++j) {
         y[yindex++] = 0;
      }

      for(int i = 0; i < x.length; ++i) {
         System.out.print("" + y[i] + "\t");
      }

   }
}
