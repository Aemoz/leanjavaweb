package demo06.Predicate;

import java.util.function.Predicate;

public class Demo01Predicate {

    public static boolean checkString(String s, Predicate<String> pre) {
        return pre.test(s);
    };

    public static void main(String[] args) {

//        boolean t = checkString("hello", (String s) -> {
//            if (s.length() == 5) {
//                return true;
//            } return false;
//        });
//        System.out.println(t);

        //optimize
        boolean t = checkString("hello", s -> s.length() == 5);
        System.out.println(t);

    }
}
