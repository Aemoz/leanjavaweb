package demo01.Init;

public class Student {

    private String name;
    private int age;

    public Student() {
        System.out.println("init");
    }

    public Student(int age, String name) {
        this.name = name;
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }


    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}

