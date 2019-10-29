package demo08.Stream;

import java.util.stream.Stream;

public class Demo04_filter {
    public static void main(String[] args) {

        Stream<String> stream = Stream.of("张三", "李四", "赵武");
        Stream<String> stream1 = stream.filter(name->(name.startsWith("张")));
        stream1.forEach(name-> System.out.println(name));


    }
}
