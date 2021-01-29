package functionalinterface;

import java.util.function.BiFunction;
import java.util.function.Function;

/**
 * Created by Bulut Cakan (179997) on
 * Hour :16:49
 * Day: Thursday
 * Month:January
 * Year:2021
 */
public class _Function {

    public static void main(String[] args) {
        int increment = increment(1);
        System.out.println(increment);

        int incrementByOne = incrementByOneFunction.apply(1);
        System.out.println(incrementByOne);

        int multipleResult = multipleBy10.apply(incrementByOne);
        System.out.println(multipleResult);


        //
        Function<Integer, Integer> addBy1AndThenMultiplyBy10 = incrementByOneFunction.andThen(multipleBy10);
        System.out.println(addBy1AndThenMultiplyBy10.apply(1));

        //BIfunction takes 2 argument and process 1 argument
        int incrementByOneAndMultiply = incrementByOneAndMultiplyBiFunction.apply(4, 100);
        System.out.println(incrementByOneAndMultiply);

    }

    static Function<Integer, Integer> multipleBy10 = number -> number * 10;

    static Function<Integer, Integer> incrementByOneFunction = number -> number + 1;

    static int increment(int number) {
        return number + 1;
    }

    static BiFunction<Integer, Integer, Integer> incrementByOneAndMultiplyBiFunction = (number, numToMultiplyBy) -> (number + 1) * numToMultiplyBy;

    static int incrementByOneAndMultiply(int number, int numToMultiplyBy) {
        return (number + 1) * numToMultiplyBy;
    }
}
