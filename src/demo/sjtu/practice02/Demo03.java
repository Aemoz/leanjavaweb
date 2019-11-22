package demo.sjtu.practice02;

import java.util.Scanner;

public class Demo03 {

    public static void main(String[] args) {
        int num1, num2;
        Scanner input = new Scanner(System.in);
        System.out.println("input number 1:");
        num1 = input.nextInt();

        System.out.println("input number 2:");
        num2 = input.nextInt();
        System.out.println("common divisor：" + commonDivisor(num1, num2));
    }

    public static int commonDivisor(int x, int y) {

        int t;
        if (x < y) {
            t = x;
            x = y;
            y = t;
        }
        while (y != 0) {
            if (x == y) return x;
            else {
                int k = x % y;
                x = y;
                y = k;
            }
        }
        return x;

    }

}
