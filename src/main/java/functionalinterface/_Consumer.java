package functionalinterface;

import model.Customer;

import java.util.function.BiConsumer;
import java.util.function.Consumer;

/**
 * Created by Bulut Cakan (179997) on
 * Hour :16:18
 * Day: Thursday
 * Month:January
 * Year:2021
 */
public class _Consumer {
    // Represents an operation that accepts a single input argument and returns no result.

    public static void main(String[] args) {
        Customer maria = Customer.builder().
                customerName("Maria").
                customerEmail("99999").
                build();
        //Normal Java Function
        greetCustomer(maria);
        //Consumer Functional
        greetCustomerFunction.accept(maria);

        greetCustomerFunction2.accept(maria, false);
    }

    static Consumer<Customer> greetCustomerFunction = customer ->
            System.out.println("Hello" + customer.getCustomerName() + ", " +
                    "thanks for registering phone number "
                    + customer.getCustomerEmail());

    static BiConsumer<Customer, Boolean> greetCustomerFunction2 = (customer, showPhoneNumber) ->
            System.out.println("Hello" + customer.getCustomerName() + ", " +
                    "thanks for registering phone number "
                    + (showPhoneNumber ? customer.getCustomerEmail() : "***********"));


    static void greetCustomer(Customer customer) {
        System.out.println("Hello" + customer.getCustomerName() + ", " +
                "thanks for registering phone number "
                + customer.getCustomerEmail());
    }

}
