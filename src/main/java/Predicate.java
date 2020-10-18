@FunctionalInterface
public interface Predicate<T> {
  boolean test(T t);

  default Predicate<T> and(Predicate<T> p2) {
    return p1 -> test(p1) && p2.test(p1);
  }
}
