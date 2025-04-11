import java.util.*;
import java.util.stream.Collectors;

class Person {
    String name;
    String city;

    Person(String name, String city) {
        this.name = name;
        this.city = city;
    }

    public String toString() {
        return name + " from " + city;
    }
}

public class GroupByExample {
    public static void main(String[] args) {
        List<Person> people = Arrays.asList(
                new Person("Alice", "Delhi"),
                new Person("Bob", "Mumbai"),
                new Person("Charlie", "Delhi")
        );

        Map<String, List<Person>> groupedByCity = people.stream()
                .collect(Collectors.groupingBy(p -> p.city));

        groupedByCity.forEach((city, list) -> {
            System.out.println(city + " => " + list);
        });

        Map<String, Long> countByCity = people.stream()
                .collect(Collectors.groupingBy(p -> p.city, Collectors.counting()));
        System.out.println(countByCity);
    }
}
