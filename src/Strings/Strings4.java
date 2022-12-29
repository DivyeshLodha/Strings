package Strings;

public class Strings4 {
    public static void main(String[] args) {

        String str = "Handling is easy topic";

        str = str.replace('H','#');

        System.out.println(str);

        str = str.replace("easy","hard");
        System.out.println(str);

        System.out.println(str.charAt(3));
        System.out.println(str.length());
        System.out.println(str.codePointAt(0));
        System.out.println(str.startsWith("A"));
        System.out.println(str.endsWith("Topic"));

    }
}






