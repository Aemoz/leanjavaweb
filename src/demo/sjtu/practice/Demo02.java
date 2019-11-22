// create by Carl  11/11/2019
package demo.sjtu.practice;

public class Demo02 {


    public static int fact(int x) {
        if (x == 0) return 1;
        int result = 1;
        for (int i = 1; i <= x; i++) {
            result *= i;
        }
        return result;
    }

    public static void main(String[] args) {

        System.out.println(fact(3));
    }

}
