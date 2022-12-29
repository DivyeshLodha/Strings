package Strings;

public class Strings {

    int age;
    String name;
    Strings(int age,String name){
        this.age=age;
        this.name=name;

}
void print() {
    System.out.println(this.name);
}



    public static void main(String[] args) {

        Strings strings = new Strings(1,"sa");

    }



    }

