package demo07.Function;

import java.util.function.Function;

public class Demo02Apply_andThen {

    public static void change(String str, Function<String, Integer> fun1, Function<Integer, String> fun2) {
        String ss = fun1.andThen(fun2).apply(str);
        System.out.println(ss);
    }

    public static void main(String[] args) {
//        change("123",(s) -> {
//            return Integer.parseInt(s) + 10;
//        },(s) -> {
//           return  s + "";
//        } );


        change("153", s -> Integer.parseInt(s)+10 , s -> s + "");


    }


}
