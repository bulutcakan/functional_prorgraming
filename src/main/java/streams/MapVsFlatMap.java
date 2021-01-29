package streams;

/**
 * Created by Bulut Cakan (179997) on
 * Hour :08:28
 * Day: Friday
 * Month:January
 * Year:2021
 */
public class MapVsFlatMap {
    /*
    static List<Customer> customers = Stream.of(
            new Customer("John", "john@gmail.com", Arrays.asList("05524180", "05324311"), 12),
            new Customer("Ali", "ali@gmail.com", Arrays.asList("05554180", "05324111"), 44),
            new Customer("Veli", "veli@gmail.com", Arrays.asList("05564180", "34354353456"), 33),
            new Customer("Ahmet", "ahmet@gmail.com", Arrays.asList("05574180", "053241431"), 22),
            new Customer("Mehmet", "mehmet@gmail.com", Arrays.asList("05584180", "987457899"), 88)

    ).collect(Collectors.toList());

    public static void main(String[] args) {

        System.out.println(getCustomersMailSupplierFunction.get());
        System.out.println(getCustomersPhoneNumbersSupplierFunction.get());
        System.out.println(getCustomersPhoneNumbersOnStream.get());

    }

    //Map for One to One mapping
    //Data transformation
    static Supplier<List<String>> getCustomersMailSupplierFunction = () -> customers.stream()
            .map(customer -> customer.getCustomerEmail().orElse("")).collect(Collectors.toList());

    static Supplier<List<List<String>>> getCustomersPhoneNumbersSupplierFunction = () -> customers.stream()
            .map(customer -> customer.getPhoneNumbers().orElse(new ArrayList<>())).collect(Collectors.toList());

    //Map for One to Many mapping
    //Data transformation
    static Supplier<List<String>> getCustomersPhoneNumbersOnStream = () -> customers.stream().
            flatMap(customer -> customer.getPhoneNumbers().orElse(new ArrayList<>()).stream()).collect(Collectors.toList());

     */
}
