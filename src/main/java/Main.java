import java.util.stream.Stream;

public class Main {

  public static void main(String[] args) {

    Stream.Builder<String> builder = Stream.builder();
    builder.add("Hello").add("World").accept("!!!");
    Stream<String> stringStream = builder.build();

    // Peek is a intermediate call. This results to nothing
    // Stream needs terminal call to work. System.out.println is terminal call.
    stringStream
      .map(String::length)
      .peek(System.out::println)
      .filter(s -> s > 3)
      .forEach(System.out::println);

  }
}
