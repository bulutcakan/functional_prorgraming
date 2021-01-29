package functionalinterface;

import java.util.Objects;
import java.util.function.Predicate;

/**
 * Created by Bulut Cakan (179997) on
 * Hour :17:48
 * Day: Thursday
 * Month:January
 * Year:2021
 */
public class _Predicate {

    public static void main(String[] args) {
        System.out.println("07000000000");
        System.out.println(isPhoneNumberValid("07000000000"));
        System.out.println("09000077000");
        System.out.println(isPhoneNumberValid("09000077000"));

        System.out.println("Predicate");
        System.out.println(isPhoneNumberValidPredicate.test("07000000000"));
        System.out.println(isPhoneNumberValidPredicate.test("09000000000"));

        System.out.println("Is phone number valid and contains 3 : " +
                isPhoneNumberValidPredicate.and(containsNumber3Predicate).test("07000000000"));

        System.out.println("Is phone number valid and contains 3 : " +
                isPhoneNumberValidPredicate.and(containsNumber3Predicate).test("07300000000"));


    }

    static Predicate<String> isPhoneNumberValidPredicate = phoneNumber ->
            Objects.nonNull(phoneNumber) && phoneNumber.startsWith("07") && phoneNumber.length() == 11;

    static boolean isPhoneNumberValid(String phoneNumber) {
        return Objects.nonNull(phoneNumber) && phoneNumber.startsWith("07") && phoneNumber.length() == 11;
    }

    static Predicate<String> containsNumber3Predicate = phoneNumber -> phoneNumber.contains("3");
}
