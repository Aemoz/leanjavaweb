package demo13.ThisMethodReference;

public class Husband {

    public void buyHouse () {
        System.out.println("buy room in beijin");
    }

    public void marry(Richable r) {
        r.buy();
    }

    public void soHappy() {
//        marry(()-> {
//            this.buyHouse();
//        });

        marry(this::buyHouse);
    }

    public static void main(String[] args) {
        new Husband().soHappy();


    }

}
