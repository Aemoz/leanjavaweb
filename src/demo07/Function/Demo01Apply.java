package demo07.Function;

import java.util.function.Function;

public class Demo01Apply {
    private static void method(String s,Function<String, Integer> fun) {
        Integer in = fun.apply(s);
        System.out.println(in);
    }

    public static void main(String[] args) {
        method("1", (String s1) -> {
          return Integer.parseInt(s1);
        });
    }
}
