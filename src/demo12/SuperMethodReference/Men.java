package demo12.SuperMethodReference;

public class Men extends Human {
    @Override
    public void sayHello() {
        System.out.println("hello,I'm men");
    }

    public void method(Greetable g) {
        g.greet();
    }

    public void show() {


//        method(()->{
//            new Human().sayHello();
//        });


//        method(()->{
//            super.sayHello();
//        });


        method(super::sayHello);
    }


    public static void main(String[] args) {
        new Men().show();
    }

}
