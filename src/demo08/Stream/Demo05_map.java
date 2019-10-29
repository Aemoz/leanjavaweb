package demo08.Stream;

import java.util.stream.Stream;

public class Demo05_map {

    public static void main(String[] args) {
        Stream<String> stream = Stream.of("1", "2", "3");

        Stream<Integer> stream1 = stream.map(s -> Integer.parseInt(s));

        stream1.forEach(name-> System.out.println(name));
    }
}
