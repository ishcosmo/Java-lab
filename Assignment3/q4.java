//Reverse sentence
public class q4{
    public static void main(String[] ar) {
        String a = "this is a string.";
        String s[]= a.split(" ");
        for(int x=s.length-1;x>=0;x--){
            System.out.println(s[x]);
        }

    }
}