import java.util.function.Function;

@FunctionalInterface
public interface Comparator<T> {
  int compare(T t1, T t2);

  static <U> Comparator<U> comparing(Function<U, Comparable> f) {
    return (p1, p2) -> f.apply(p1).compareTo(f.apply(p2));
  }

  default Comparator<T> thenComparing(Comparator<T> c) {
    return (p1, p2) -> compare(p1, p2) == 0 ? c.compare(p1, p2) : compare(p1, p2);
  }

}