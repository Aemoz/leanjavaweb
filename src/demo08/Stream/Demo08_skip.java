package demo08.Stream;

import java.util.stream.Stream;

public class Demo08_skip {
    public static void main(String[] args) {
        Stream<String> stream = Stream.of("1", "2", "3", "4");
        Stream<String> skip = stream.skip(3);
        skip.forEach(name-> System.out.println(name));
    }
}
