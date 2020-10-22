import java.util.stream.Stream;

public class Main {

  public static void main(String[] args) {

    Stream.Builder<String> builder = Stream.builder();
    builder.add("Hello").add("World").accept("!!!");
    Stream<String> stringStream = builder.build();

    // Peek is a intermediate call. This results to nothing
    stringStream
      .map(String::length)
      .filter(s -> s > 3)
      .peek(System.out::println);
  }
}
