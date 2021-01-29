package streams;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Created by Bulut Cakan (179997) on
 * Hour :14:35
 * Day: Friday
 * Month:January
 * Year:2021
 */
public class _ListUtils {

    static List<Integer> numbers = Stream.of(1, 5, 6, 23, 63, 323, 65, 21, 21, 63).collect(Collectors.toList());
    ;

    public static void main(String[] args) {

        System.out.println("Sorted ");
        Stream<Integer> sorted = numbers.stream().sorted();
        sorted.forEach(System.out::println);
        System.out.println("------------------------");

        System.out.println("Distinct ");
        Stream<Integer> distinct = numbers.stream().distinct();
        distinct.forEach(System.out::println);
        System.out.println("------------------------");

        System.out.println("Skip 2 and Sorted ");
        //Baştan iki elamanı alma
        Stream<Integer> skipped = numbers.stream().skip(2);
        skipped.forEach(System.out::println);
        System.out.println("------------------------");

        System.out.println("Peeked  ");
        //Baştan iki elamanı alma
        Stream<Integer> peeked = numbers.stream().filter(a->a>10).peek(a->System.out.println("Peaked :"+a ));
        peeked.forEach(System.out::println);
        System.out.println("------------------------");


    }
}
