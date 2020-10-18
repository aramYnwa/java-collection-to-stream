import java.util.function.Function;

public class MainComparator {

  public static void main(String[] args) {
    Comparator<Person> cmpAge = (p1, p2) -> p1.getAge() - p2.getAge();
    Comparator<Person> cmpFirstName = (p1, p2) -> p1.getFirstName().compareTo(p2.getFirstName());

    Function<Person, Integer> fAge = p -> p.getAge();
    Function<Person, String> fFirstName = p -> p.getFirstName();

    // Made the comparing generic so it can get different functions
    Comparator<Person> cmpAgeFunc = Comparator.comparing(Person::getAge);
    Comparator<Person> cmpFirstNameFunc = Comparator.comparing(Person::getFirstName);
  }
}
