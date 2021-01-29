package Conbinator;

import model.Customer;
import validations.CustomerRegistrationValidator;
import validations.CustomerValidatorService;

import java.time.LocalDate;

/**
 * Created by Bulut Cakan (179997) on
 * Hour :10:01
 * Day: Friday
 * Month:January
 * Year:2021
 */
public class Combinator {


    public static void main(String[] args) {
        Customer bulut = Customer.builder().customerName("Bulut").
                customerEmail("bulutcakan@gmail.com").
                phoneNumber("+95524180802").
                dob(LocalDate.of(1987, 4, 8)).build();
        CustomerValidatorService customerValidatorService = new CustomerValidatorService();

        System.out.println(customerValidatorService.isValid(bulut));

        CustomerRegistrationValidator.ValidationResult result = CustomerRegistrationValidator.
                isEmailValid().and(CustomerRegistrationValidator.isPhoneNumberValid())
                .and(CustomerRegistrationValidator.isAnAdult()).apply(bulut);

        System.out.println(result);

        if (!result.name().equals(CustomerRegistrationValidator.ValidationResult.SUCCESS))
            throw new IllegalArgumentException(result.name());
    }
}
