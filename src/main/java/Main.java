public class Main {

  public static void main(String[] args) {

    Predicate<String> p1 = p -> p.length() < 20;
    Predicate<String> p2 = p -> p.startsWith("B");
    Predicate<String> p3 = p -> !p.isEmpty();

    Predicate<String> andP = p1.and(p2).and(p3);
    Predicate<String> orP = p1.or(p2);

    Predicate<String> isEqP = Predicate.isEqual("Yes");

    System.out.println(andP.test("Avatar"));
    System.out.println(orP.test("Avatar"));
    System.out.println(isEqP.test("Yes"));
  }
}
