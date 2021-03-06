package streams;

import model.Gender;
import model.Person;

import java.util.List;
import java.util.function.Function;
import java.util.function.IntConsumer;
import java.util.function.Predicate;
import java.util.function.ToIntFunction;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Created by Bulut Cakan (179997) on
 * Hour :01:56
 * Day: Friday
 * Month:January
 * Year:2021
 */
public class _Streams {
    static List<Person> people = Stream.of(
            new Person("John", Gender.MALE, 25),
            new Person("Mari", Gender.FEMALE, 22),
            new Person("Aisha", Gender.FEMALE, 23),
            new Person("Alex", Gender.MALE, 12),
            new Person("Alix", Gender.FEMALE, 34),
            new Person("BOB", Gender.GAY, 77)

    ).collect(Collectors.toList());

    public static void main(String[] args) {
        people.stream().map(person -> person.getGender()).collect(Collectors.toList()).
                forEach(System.out::println);

        Function<Person, String> personStringFunction = person -> person.getName();
        ToIntFunction<String> stringToIntFunction = name -> name.length();
        IntConsumer println = System.out::println;
        people.stream().map(personStringFunction).
                mapToInt(stringToIntFunction).
                forEach(println);

        Predicate<Person> personPredicate = person -> person.getGender().equals(Gender.FEMALE);

        boolean containsOnlyFemale = people.stream().allMatch(personPredicate);
        System.out.println(containsOnlyFemale);

    }
}
