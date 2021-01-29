package finalsection;

import java.util.function.Consumer;

/**
 * Created by Bulut Cakan (179997) on
 * Hour :10:36
 * Day: Friday
 * Month:January
 * Year:2021
 */
public class CallBacks {

    public static void main(String[] args) {

        hello("john", "Montana", value -> {
                    System.out.println("no lastname provided for " + value);
                }
        );

        hello2("john", null, () -> {
                    System.out.println("no lastname provided for ");
                }
        );
    }

    static void hello(String firstName, String lastname, Consumer<String> callback) {
        if (lastname != null)
            System.out.println(lastname);
        else
            callback.accept(firstName);
    }

    static void hello2(String firstName, String lastname, Runnable callback) {
        if (lastname != null)
            System.out.println(lastname);
        else
            callback.run();
    }
}
