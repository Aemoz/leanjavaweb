package demo11.StaticMethodReference;

public class Demo01StaticMethodReference {

    public static int method(int number, Calcable c) {
        return c.calsAbs(number);
    }


    public static void main(String[] args) {

        int number = method(-10,num -> {
            return Math.abs(num);
        });

        System.out.println(number);

        int number1 = method(-1,Math::abs);
        System.out.println(number1);

    }

}
