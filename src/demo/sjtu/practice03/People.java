package demo.sjtu.practice03;

class Birth {
    int year, month, day;
    Birth(int year, int month, int day) {
        this.year = year;
        this.month = month;
        this.day = day;
    }
}

enum gender{
    MALE,
    FEMALE,
}

public class People {
    String name;
    Birth birth;
    gender s;
    float height;
    float weight;

    public People(String name, Birth birth, gender s, float height, float weight) {
        this.name = name;
        this.birth = birth;
        this.s = s;
        this.height = height;
        this.weight = weight;
    }

    public String toString() {
        return this.name+'\t'+this.birth+'\t'+this.s+'\t'+this.height+'\t'+this.weight+'\t';
    }
}
