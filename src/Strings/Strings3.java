package Strings;

public class Strings3 {

    public static void main(String[] args) {

        String str = "   hello";

        str = str.concat("  world      ");

        str=str.concat("hi");

        str = str.toUpperCase();

        System.out.println(str);

        str = str.trim();
        System.out.println(str);


    }


}


