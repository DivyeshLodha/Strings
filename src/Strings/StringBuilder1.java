package Strings;

public class StringBuilder1 {
    public static void main(String[] args) {
        String string = new String("abc");
        String string2 = "abc";


        //   StringBuilder stringBuilder = "abc";
        // StringBuffer stringBuffer = "abc";

        StringBuilder stringBuilder = new StringBuilder("Hello");
        stringBuilder.append(" world");
        System.out.println(stringBuilder);

        stringBuilder.delete(1,5);
        System.out.println(stringBuilder);

//        stringBuilder.insert(0,"hhhhh");
//        System.out.println(stringBuilder);
    }
}
