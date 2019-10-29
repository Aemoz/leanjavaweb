package demo08.Stream;

import java.util.stream.Stream;

public class Demo07_limt {

    public static void main(String[] args) {
        Stream<String> stream = Stream.of("1", "2", "3", "4");

        Stream<String> limit = stream.limit(2);

        limit.forEach(obj-> System.out.println(obj));
    }

}
