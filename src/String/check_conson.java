package String;

public class check_conson {
    public static void main(String[] args) {
        char ch  = '9';

        if((ch >= 'a' && ch <='z') || (ch >= 'A' && ch<='z')){
            System.out.println(ch + " is a alphabet");
        }
        else{
            System.out.println( ch +" is not a alphabet");
        }
    }
}
