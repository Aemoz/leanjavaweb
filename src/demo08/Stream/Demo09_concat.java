package demo08.Stream;

import java.util.stream.Stream;

public class Demo09_concat {
    public static void main(String[] args) {
        Stream<String> stream = Stream.of("1", "2", "3", "4");
        Stream<String> stream1 = Stream.of("2", "5", "6", "7");

        Stream<String> concat = Stream.concat(stream, stream1);

        concat.forEach(name-> System.out.println(name));

    }
}
