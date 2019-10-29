package demo08.Stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class Demo01Stream {

//    public static void short(String str, Stream<List> fun1,)

    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("张无忌");
        list.add("周芷若");
        list.add("赵敏");
        list.add("谢逊");
        list.add("张三丰");
        list.add("张强");

        List<String> listA = new ArrayList<>();

        list.stream()
                .filter(name->name.startsWith("张"))
                .filter(name->name.length()>2)
                .forEach(name->System.out.println(name));

        System.out.println(listA);
    }

}
