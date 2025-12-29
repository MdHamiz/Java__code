package String;

public class remove_character {
    public static void main(String[] args) {
        String s = "spahds2.8A8***nxuasi)";
        for(int i = 0 ; i< s.length();i++){
            if(s.charAt(i)<'A' || s.charAt(i) > 'z' && s.charAt(i) <'a' || s.charAt(i)>'z'){
                s= s.substring(0,i)+ s.substring(i+1);
                i--;
            }
        }
        System.out.println(s);
    }
}
