package String;

public class palindrom_string {
    public static void main(String[] args) {
        String s = "arora";
        String rev = "";

        for (int i = s.length()-1; i>= 0 ; i--){
            rev = rev + s.charAt(i);

        }
        System.out.println(rev);
        if( s.equals(rev)){
            System.out.println("String is Palindrom");
        }
        else{
            System.out.println("String is not palindrom");
        }
    }
}
