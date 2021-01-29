package model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

/**
 * Created by Bulut Cakan (179997) on
 * Hour :16:14
 * Day: Thursday
 * Month:January
 * Year:2021
 */
@Data
@ToString
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Customer {
    private String customerName;

    private String customerEmail;

    private String phoneNumber;

    private List<String> phoneNumbers;

    private LocalDate dob;

    private Integer age;

    public Optional<String> getCustomerName() {
        return Optional.ofNullable(customerName);
    }

    public Optional<String> getCustomerEmail() {
        return Optional.ofNullable(customerEmail);
    }

    public Optional<List<String>> getPhoneNumbers() {
        return Optional.ofNullable(phoneNumbers);
    }
}
