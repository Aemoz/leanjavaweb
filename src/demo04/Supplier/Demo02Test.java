package demo04.Supplier;

import java.util.function.Supplier;

public class Demo02Test {
    public static int getMax(Supplier<Integer> sup) {
        return sup.get();
    }

    public static void main(String[] args) {
        int[] arr = {100, 3, 64, 234, 2345, 35};

        int maxValue = getMax(()->{
            int max = arr[0];
            for (int i : arr) {
                if (max < i) max = i;
            }
            return max;
        });
        System.out.println(maxValue);
    }


}

