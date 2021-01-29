package optionals;

import model.Gender;
import model.Person;

import java.util.List;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Created by Bulut Cakan (179997) on
 * Hour :01:46
 * Day: Friday
 * Month:January
 * Year:2021
 */
public class _Optionals {

    static List<Person> people = Stream.of(
            new Person("John", Gender.MALE),
            new Person("Mari", Gender.FEMALE),
            new Person("Aisha", Gender.FEMALE),
            new Person("Alex", Gender.MALE),
            new Person("Alix", Gender.FEMALE),
            new Person("BOB", Gender.GAY)

    ).collect(Collectors.toList());

    public static void main(String[] args) {

        Person person = new Person("bulut", Gender.MALE);

        Optional.ofNullable(null);
        Optional<Object> empty = Optional.empty();
        System.out.println(empty);

        Optional<String> nameOptional = Optional.ofNullable(person.getName());

        System.out.println(nameOptional.orElse("Yok"));
        System.out.println(nameOptional.map(String::toUpperCase).get());
        System.out.println(nameOptional.orElseThrow(() -> new IllegalArgumentException("Sıkıtnı")));
        System.out.println(findByNameFunction.apply("john"));
    }

    static Function<String, Person> findByNameFunction = name -> people.stream().filter(person ->
            person.getName().equalsIgnoreCase(name)).findFirst().orElse(new Person());
}
