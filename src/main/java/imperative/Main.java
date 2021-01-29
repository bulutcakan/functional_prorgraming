package imperative;

import model.Gender;
import model.Person;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Created by Bulut Cakan (179997) on
 * Hour :15:51
 * Day: Thursday
 * Month:January
 * Year:2021
 */
public class Main {
    static List<Person> people = Stream.of(
            new Person("John", Gender.MALE, 25),
            new Person("Mari", Gender.FEMALE, 22),
            new Person("Aisha", Gender.FEMALE, 23),
            new Person("Alex", Gender.MALE, 12),
            new Person("Alix", Gender.FEMALE, 34),
            new Person("BOB", Gender.GAY, 77)

    ).collect(Collectors.toList());

    public static void main(String[] args) {


        //Imperative Programing

        System.out.println("Imperative approach");

        List<Person> females = new ArrayList<>();

        for (Person person : people) {
            if (Gender.FEMALE.equals(person.getGender())) {
                females.add(person);
            }
        }

        for (Person femalePerson : females) {
            System.out.println(femalePerson);
        }

        System.out.println("Declarative approach");

        //Declarative approach

      /* people.stream().filter(person ->
                person.getGender().equals(Gender.FEMALE)).forEach(System.out::println); */

        List<Person> femaleCollection = people.stream().filter(person ->
                person.getGender().equals(Gender.FEMALE)).collect(Collectors.toList());

        femaleCollection.forEach(System.out::println);

    }

}

