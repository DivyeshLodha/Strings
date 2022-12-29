package Strings;

public class StringsBuffer1{
    public static void main(String[] args) {


        StringBuilder stringBuilder  = new StringBuilder("welcome to String handling");

        StringBuffer stringBuffer = new StringBuffer();

        String str = new String(stringBuffer);

        String str2 =new String(stringBuilder);

        String str3 = new String(stringBuffer);

        StringBuffer stringBuffer1 = new StringBuffer(str);
        StringBuilder stringBuilder1 = new StringBuilder(stringBuilder);

        String greet = "Good morning";

        String substring = greet.substring(0,4);
        System.out.println(substring);






    }



    }

