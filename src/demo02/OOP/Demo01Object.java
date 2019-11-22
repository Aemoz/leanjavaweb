package demo02.OOP;

import java.util.Arrays;

public class Demo01Object {

    public static void main(String[] args) {
        int [] array = {123,124,23,5,34,6,457,585,8,34,67,9789,55,7,9};
        System.out.print("[");
        for (int i : array) {
            System.out.print(i + ",");
        }
        System.out.print("]");

        System.out.println(Arrays.toString(array));
    }

}
