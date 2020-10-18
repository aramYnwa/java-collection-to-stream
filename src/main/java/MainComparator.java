public class MainComparator {

  public static void main(String[] args) {
    Comparator<Person> comparator = new Comparator<Person>() {
      @Override
      public int compare(Person t1, Person t2) {
        return 0;
      }
    };
  }
}
