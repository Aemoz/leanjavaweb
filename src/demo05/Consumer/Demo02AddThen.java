package demo05.Consumer;

import java.util.function.Consumer;

public class Demo02AddThen {
    public static void method (String s, Consumer<String> con1, Consumer<String> con2){
//        con1.accept(s);
//        con2.accept(s);

        //optimize
        con1.andThen(con2).accept(s);
    }

    public static void main(String[] args) {
        method("test", (t)->{
            System.out.println(t.toUpperCase());
        }, (t)->{
            System.out.println(t.toLowerCase());
        });
    }

}
