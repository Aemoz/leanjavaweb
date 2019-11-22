package demo.sjtu.practice02;

public class Demo02 {

    public static void main(String[] args) {
        Rect obj1 = new Rect();
        System.out.println(obj1.area());
        System.out.println(obj1.perimeter());


        Rect obj2 = new Rect(14, 39);
        System.out.println(obj2.area());
        System.out.println(obj2.perimeter());

    }

}
