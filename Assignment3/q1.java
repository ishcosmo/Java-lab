// Min max element
public class q1 {
 
    public static void main(String[] a) {
       int x[] ={1,2,3, 4,-1, 0,-2};
       int max = Integer.MIN_VALUE;
       int min = Integer.MAX_VALUE;
 
       for(int i = 0; i < x.length; ++i) {
          int k = x[i];
          max = max < k ? k : max;
          min = min > k ? k : min;
       }
 
       System.out.printf("[%d, %d]", max, min);
    }
 }
 