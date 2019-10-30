package demo10.ObjeMethodReference;

public class Demo01ObjectMethodReference {

    public static void printString(Print p) {
        p.print("hello object");

    }

    public static void main(String[] args) {
        printString(s->{
            MethodReObject obj = new MethodReObject();
            obj.printUpperString(s);
        });
        MethodReObject obj = new MethodReObject();

        printString(obj::printUpperString);

    }
}
