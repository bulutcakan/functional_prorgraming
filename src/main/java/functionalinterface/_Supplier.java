package functionalinterface;

import java.util.List;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Created by Bulut Cakan (179997) on
 * Hour :01:28
 * Day: Friday
 * Month:January
 * Year:2021
 */
public class _Supplier {

    // Represents a supplier of results.


    public static void main(String[] args) {
        System.out.println(getDBConnectionUrl());
        System.out.println(getDBConnectionUrlSupplier.get());


    }

    static String getDBConnectionUrl() {
        return "jdbc://localhost:5432/user";
    }

    static Supplier<List<String>> getDBConnectionUrlSupplier = () ->
            Stream.of("jdbc://localhost:5432/user", "jdbc://localhost:5432/customer").
                    collect(Collectors.toList());
}
