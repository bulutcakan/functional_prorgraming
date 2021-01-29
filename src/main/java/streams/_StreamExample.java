package streams;

import model.Gender;
import model.Person;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Created by Bulut Cakan (179997) on
 * Hour :23:11
 * Day: Friday
 * Month:January
 * Year:2021
 */
public class _StreamExample {

    static List<Person> people = Stream.of(
            new Person("John", Gender.MALE, 25),
            new Person("Mari", Gender.FEMALE, 22),
            new Person("Aisha", Gender.FEMALE, 23),
            new Person("Alex", Gender.MALE, 12),
            new Person("Alix", Gender.FEMALE, 34),
            new Person("BOB", Gender.GAY, 77)

    ).collect(Collectors.toList());


    public static void main(String[] args) {
        System.out.println("Find Females");
        List<Person> collect = people.stream().
                filter(person -> person.getGender().equals(Gender.FEMALE)).collect(Collectors.toList());
        collect.stream().forEach(System.out::println);
        System.out.println("-------------------------");

        System.out.println("Sort by Age");
        List<Person> collect1 = people.stream().sorted(Comparator.comparing(Person::getAge)).collect(Collectors.toList());
        collect1.stream().forEach(System.out::println);
        System.out.println("-------------------------");


        // All match
        boolean allMatch = people.stream()
                .allMatch(person -> person.getAge() > 8);

//    System.out.println(allMatch);
        // Any match
        boolean anyMatch = people.stream()
                .anyMatch(person -> person.getAge() > 121);

//    System.out.println(anyMatch);
        // None match
        boolean noneMatch = people.stream()
                .noneMatch(person -> person.getName().equals("Antonio"));

//    System.out.println(noneMatch);

        // Max
        people.stream()
                .max(Comparator.comparing(Person::getAge));
//        .ifPresent(System.out::println);

        // Min
        people.stream()
                .min(Comparator.comparing(Person::getAge));
//        .ifPresent(System.out::println);

        // Group
        Map<Gender, List<Person>> groupByGender = people.stream()
                .collect(Collectors.groupingBy(Person::getGender));

//    groupByGender.forEach((gender, people1) -> {
//      System.out.println(gender);
//      people1.forEach(System.out::println);
//      System.out.println();
//    });

        Optional<String> oldestFemaleAge = people.stream()
                .filter(person -> person.getGender().equals(Gender.FEMALE))
                .max(Comparator.comparing(Person::getAge))
                .map(Person::getName);

        oldestFemaleAge.ifPresent(System.out::println);
    }
}
