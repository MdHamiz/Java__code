package object;

public class object1 {
    public static void main(String[] args) {
        String a = "hamiz,imam";
        System.out.println(a);
        System.out.println(a.length());
        System.out.println(a.charAt(2)) ;
        System.out.println(a.substring(4,9));
        System.out.println(a.concat("!!!"));
        System.out.println(a.indexOf("imam"));
        System.out.println(a.indexOf("m",6));
        System.out.println(a.indexOf("a",4,10));
        System.out.println(a.lastIndexOf("H"));
        System.out.println(a.equals("hamiz,i"));
        System.out.println(a.equals("hamiz,imam"));
        System.out.println((a.equalsIgnoreCase("Hamiz,Imam")));
        System.out.println(a.toLowerCase());
        System.out.println(a.toUpperCase());
        System.out.println(a.trim());

        String b = "  computer science  ";
        System.out.println(b.trim()); //removing spaces from both side start and end
        System.out.println(a.replace("a","b"));
        System.out.println(a.contains("imam"));
        char[] c= a.toCharArray();
        for(char arr:c ){
            System.out.print(arr);
        }
        System.out.println();
        System.out.println(a.replace("hamiz","sahil"));
       

    }
}
