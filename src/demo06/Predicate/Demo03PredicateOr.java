package demo06.Predicate;

import java.util.function.Predicate;

public class Demo03PredicateOr {

    public static boolean method(String s, Predicate<String> pre1, Predicate<String> pre2) {
        return pre1.or(pre2).test(s);
    }

    public static void main(String[] args) {
        boolean status = method("sunday", s->{
            return s.length() > 5;
        },s -> {
            return s.contains("s");
        });
        System.out.println(status);
    }


}
