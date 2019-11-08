package demo15.Scanner;

import java.util.Scanner;

public class Demo01Scanner {

    public static void main(String[] args) {

        //从键盘进行输入
        Scanner sc = new Scanner(System.in);

        int i = sc.nextInt();
        int b = sc.nextInt();

        System.out.println("input :" + (i>b ? i:b));

    }


}
