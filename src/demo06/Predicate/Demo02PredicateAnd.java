package demo06.Predicate;

import java.util.function.Predicate;

public class Demo02PredicateAnd {

    public static boolean method(String s, Predicate<String> pre1, Predicate<String> pre2) {

        //        return  pre1.test(s) && pre2.test(s);
        //optimize
        return  pre1.and(pre2).test(s);

    };

    public static void main(String[] args) {
        boolean s = method("abcdefg",(T)->{
            return T.length()>3;
        }, (T)->{
            return T.length() < 10;
        });

        System.out.println(s);
    }
}
