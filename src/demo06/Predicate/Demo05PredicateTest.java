package demo06.Predicate;

import java.util.ArrayList;
import java.util.function.Predicate;

public class Demo05PredicateTest {

    public static ArrayList<String> method(String[] arr, Predicate<String> pre, Predicate<String>pre2) {

        ArrayList<String> list = new ArrayList<>();
        for (String s : arr) {
            boolean b = pre.and(pre2).test(s);
            if (b) list.add(s);
        }
        return list;
    };


    public static void main(String[] args) {
        String[] array = {};

        method(array, s -> {
           return true;
        }, s -> {
            return true;
        });

    }

}
