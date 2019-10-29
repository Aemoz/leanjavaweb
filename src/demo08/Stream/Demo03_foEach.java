package demo08.Stream;

import java.util.function.Supplier;
import java.util.stream.Stream;

public class Demo03_foEach {

    public static void main(String[] args) {
        Stream<String> stream = Stream.of("张三", "李四", "赵武");

        //        stream.forEach((String name)->{
//            System.out.println(name);
//        });

        //optimize
        stream.forEach(name->System.out.println(name));

    }
}
