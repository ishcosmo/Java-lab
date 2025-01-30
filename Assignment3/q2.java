import java.util.Arrays;
//Majority element
public class q2 {

   public static void main(String[] s) {
      int[] x ={1, 2, 2,3, 1, 2,2};
      Arrays.sort(x); 
      int c = 1;

      for(int i = 1; i < x.length; i++) {
         if (x[i] == x[i-1]) {
            ++c;
         }
         else{
            c = 1;
         }
         if (c > x.length/2) {
            System.out.println(x[i]);
            break;
         }
      }

   }
}
