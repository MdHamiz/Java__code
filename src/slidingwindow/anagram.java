package slidingwindow;

import java.util.Arrays;

public class anagram {
    public static void main(String[] args) {
        String txt = "abcfhbcakjhcabmncbaqw";
        String pat = "abc";
        countanagram(txt , pat);
    }
    public static boolean isAnagram(String s1,String s2){
        char[] a = s1.toCharArray();
        char[] b = s2.toCharArray();
        Arrays.sort(a);
        Arrays.sort(b);
        return Arrays.equals(a,b);
    }


    public static void countanagram(String txt, String pat){
        int count =0;
        int k = pat.length();
        int t = txt.length();
        String Window = "";
        for(int i=0 ; i<=t-k;i++){
             Window = txt.substring(i,i+k);
            if(isAnagram(Window,pat)){
                count ++;
                System.out.println(Window);
                
            }
        }
        System.out.println(count);
    }

}
