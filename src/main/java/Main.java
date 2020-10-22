import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

public class Main {

  public static void main(String[] args) {

    List<Integer> ints = Arrays.asList(0, 1, 2, 3, 4);

    Stream<Integer> stream1 = ints.stream();
    Stream<Integer> stream = Stream.of(0,1,2,3,4);

    stream.forEach(System.out::println);

    Stream<String> stringStream = Stream.generate(() -> "one");
    stringStream.limit(5).forEach(System.out::println);

    Stream<String> stringStream2 = Stream.iterate("+", p -> p + "+");
    stringStream2.limit(5).forEach(System.out::println);
  }
}
