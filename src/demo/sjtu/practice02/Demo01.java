package demo.sjtu.practice02;

public class Demo01 {

    public static void main(String[] args) {
        Patient obj1 = new Patient();
        obj1.setName("Carl");
        obj1.setAge(20);
        obj1.setSex('F');
        obj1.setWeight(70);
        obj1.setAllergies(true);
        obj1.toString();



        Patient obj2 = new Patient();
        obj2.setName("mark");
        obj2.setSex('M');
        obj2.setWeight(60);
        obj2.setAllergies(false);
        String info2 = obj2.toString();
        System.out.println(info2);
    }

}
