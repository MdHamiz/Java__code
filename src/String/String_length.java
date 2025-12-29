package String;

public class String_length {

    public static void main(String[] args) {
        int length =0;
         String s = "persistent";
         for(char c1: s.toCharArray()){
             length++;
         }
                System.out.print("Length of String  is : "   + length);

    }
}
