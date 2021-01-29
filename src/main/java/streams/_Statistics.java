package streams;

import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Created by Bulut Cakan (179997) on
 * Hour :14:26
 * Day: Friday
 * Month:January
 * Year:2021
 */
public class _Statistics {

    static List<Integer> numbers = Stream.of(1, 2, 3, 4, 5, 6, 12, 23, 43).collect(Collectors.toList());

    public static void main(String[] args) {

        IntSummaryStatistics intSummaryStatistics = numbers.stream().mapToInt(number -> number).summaryStatistics();
        System.out.println("Max number is :" + intSummaryStatistics.getMax());
        System.out.println("Min number is :" + intSummaryStatistics.getMin());
        System.out.println("Average of list is : " + intSummaryStatistics.getAverage());
        System.out.println("Sum of list is : " + intSummaryStatistics.getSum());
        System.out.println("Count of list is : " + intSummaryStatistics.getCount());


    }


}
