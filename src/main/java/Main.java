public class Main {

  public static void main(String[] args) {

    Predicate<String> p1 = p -> p.length() < 20;
    Predicate<String> p2 = p -> p.startsWith("A");
    Predicate<String> p3 = p -> !p.isEmpty();

    Predicate<String> p = p1.and(p2).and(p3);

    System.out.println(p.test("Avatar"));
  }
}
