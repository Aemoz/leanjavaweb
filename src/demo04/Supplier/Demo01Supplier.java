package demo04.Supplier;


import java.util.function.Supplier;

public class Demo01Supplier {

    public static String getString(Supplier<String> sup) {
        return sup.get();
    }

    public static void main(String[] args) {
        String s = getString(()->{
            return "jack";
        });

        System.out.println(s);

        String s1 = getString( ()->"jack");
        System.out.println(s1);
    }
}
