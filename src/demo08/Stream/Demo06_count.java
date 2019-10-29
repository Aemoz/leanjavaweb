package demo08.Stream;

import java.util.stream.Stream;

public class Demo06_count {

    public static void main(String[] args) {
        Stream<String> stream = Stream.of("张三", "李四", "赵武");

        long count = stream.filter(name->name.startsWith("张"))
                .count();
        System.out.println(count);
    }
}
