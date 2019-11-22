// create by Carl  11/11/2019
package demo.sjtu.practice;

public class Demo03 {

    public static void main(String[] args) {
        int[] arrays = new int[100];

        for (int i = 0; i < 100; i++) {

            int ran2 = (int) (Math.random()*(100));
            arrays[i] = ran2;
         }
        int max=0,min=100,count=0;

        for (int i: arrays ) {
            if (max < i )  max = i;
            if (min > i )  min = i;
            if (i > 50 ) count ++;
            System.out.println(i);
        }

        System.out.println("max : " + max);
        System.out.println("min :" + min);
        System.out.println("than 50 count :" + count);

    }
}
