package finalsection;

import java.util.function.Function;

/**
 * Created by Bulut Cakan (179997) on
 * Hour :11:32
 * Day: Friday
 * Month:January
 * Year:2021
 */
public class Lambdas {

    public static void main(String[] args) {
        Function<String, String> upperCaseName = String::toUpperCase;
    }
}
