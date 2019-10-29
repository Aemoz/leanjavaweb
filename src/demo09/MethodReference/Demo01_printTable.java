package demo09.MethodReference;

public class Demo01_printTable {

    public static void printString(PrintTable p) {
        p.print("hello");
    }


    public static void main(String[] args) {
//        printString(s->{
//            System.out.println(s);
//        });

        printString(System.out::println);


    }
}
