package Strings;

import java.util.StringTokenizer;

public class StringsToken{

    public static void main(String[] args) {


    String string ="Welcom to dubai";

        StringTokenizer stringTokenizer = new StringTokenizer(string,":");

        while (stringTokenizer.hasMoreElements()){
            System.out.println(stringTokenizer.nextElement());
        }
    }



    }

