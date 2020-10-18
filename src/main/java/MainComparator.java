public class MainComparator {

  public static void main(String[] args) {
    Comparator<Person> cmpAge = (p1, p2) -> p1.getAge() - p2.getAge();
    Comparator<Person> cmpFirstName = (p1, p2) -> p1.getFirstName().compareTo(p2.getFirstName());
  }
}
