package validations;

import model.Customer;

import java.time.LocalDate;
import java.time.Period;

/**
 * Created by Bulut Cakan (179997) on
 * Hour :10:46
 * Day: Friday
 * Month:January
 * Year:2021
 */
public class CustomerValidatorService {
    private boolean isEmailValid(String email) {
        return email.contains("@");
    }

    private boolean isValidPhoneNumber(String phoneNumber) {
        return phoneNumber.startsWith("+0");
    }

    private boolean isAdult(LocalDate dob) {
        return Period.between(dob, LocalDate.now()).getYears() > 16;
    }

    public boolean isValid(Customer customer) {
        return isEmailValid(customer.getCustomerEmail().get()) &&
                isValidPhoneNumber(customer.getPhoneNumber()) &&
                isAdult(customer.getDob());
    }
}
