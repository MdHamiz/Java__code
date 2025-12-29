package String;

public class Count_vowel1 {
    public static void main(String[] args) {
        String s = "HamizG OUImam";
        s= s.toLowerCase();
        int vowel = 0;
        int consonent = 0;
        String vowell = "aeiouEAIOU";
        String consonentt = "bcdfghijklmnpqrstvwxyz";
        for (int i=0; i<s.length();i++){
            char ch = s.charAt(i);
            if(vowell.indexOf(ch) != -1){
                vowel++;
            }else if (consonentt.indexOf(ch) != -1){
               consonent++;
            }
        }

        System.out.println("vowel count "+ vowel);
        System.out.println("consonant is "+ consonent);
    }
}
