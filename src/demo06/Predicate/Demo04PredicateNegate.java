package demo06.Predicate;

import java.util.function.Predicate;

public class Demo04PredicateNegate {

    public static boolean method(String s, Predicate<String> pre) {
        return pre.negate().test(s);
    }

    public static void main(String[] args) {

        boolean isTure = method("hel44lo", s -> {
            return s.length() > 5;
        });

        System.out.println(isTure);
    }


}
