package demo05.Consumer;

import java.util.function.Consumer;

public class Demo03Test {
    public static void printInfo(String[] arr, Consumer<String> con1, Consumer<String> con2) {
        for (String s : arr) {
            con1.andThen(con2).accept(s);
        }
    };

    public static void main(String[] args) {

        String[] arr = {"sj,fl", "s,dfjl", "23jklk,jl", "sjkd,fl"};

        printInfo(arr,(t)->{
            String name = t.split(",")[0];
            System.out.println("first " + name);
        }, (t)->{
            String name = t.split(",")[1];
            System.out.println("end " + name);
        });
    }
}
