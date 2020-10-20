import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;

public class Main {

  public static void main(String[] args) {
    Person p1 = new Person("Alice", 23);
    Person p2 = new Person("Brian", 56);
    Person p3 = new Person("Chelsea", 46);
    Person p4 = new Person("David", 28);
    Person p5 = new Person("Erica", 37);
    Person p6 = new Person("Francisco", 18);

    City newYork = new City("New York");
    City shanghai = new City("Shanghai");
    City paris = new City("Paris");

    List<Person> people = new ArrayList(Arrays.asList(p1, p2, p3, p4, p5, p6));

//    people.removeIf(p -> p.getAge() > 30);
//    people.replaceAll(p -> new Person(p.getName().toUpperCase(), p.getAge()));
//    people.sort(Comparator.comparing(Person::getAge).thenComparing(Person::getName).reversed());
//
//    people.forEach(System.out::println);

    Map<City, List<Person>> map = new HashMap<>();

    map.computeIfAbsent(paris, city -> new ArrayList(Arrays.asList(p2, p3)));
    map.computeIfAbsent(shanghai, city -> new ArrayList<>()).add(p4);
    map.computeIfAbsent(newYork, city -> new ArrayList<>()).add(p5);

    Map<City, List<Person>> map2 = new HashMap<>();
    map2.computeIfAbsent(shanghai, city -> new ArrayList<>()).add(p1);
    map2.computeIfAbsent(shanghai, city -> new ArrayList<>()).add(p3);

    System.out.println("People in shanghai " + map2.getOrDefault(shanghai, Collections.emptyList()));

    map.forEach(
      (city, peopleList) ->
        map2.merge(city, peopleList, (peopleFromMap1, peopleFromMap2) -> {
          peopleFromMap1.addAll(peopleFromMap2);
          return peopleFromMap1;
        })
    );

    System.out.println("People in shanghai " + map2.getOrDefault(shanghai, Collections.emptyList()));
  }
}
