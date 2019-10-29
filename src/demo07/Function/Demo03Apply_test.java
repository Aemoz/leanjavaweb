package demo07.Function;

import java.util.function.Function;

public class Demo03Apply_test {
    public static void change(String str, Function<String, String> fun1, Function<String, Integer> fun2, Function<Integer, Integer> fun3) {
        Integer i = fun1.andThen(fun2).andThen(fun3).apply(str);
        System.out.println(i);
    }

    public static void main(String[] args) {
        change("carl,20",s->{
            return s.split(",")[1];
        },s -> {
            return 20;
        }, s->{
            return s + 100;
        });
    }
}
