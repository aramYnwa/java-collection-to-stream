import java.util.stream.Stream;

public class Main {

  public static void main(String[] args) {

    Stream.Builder<String> builder = Stream.builder();
    builder.add("Hello")
      .add("World,")
      .add("wish")
      .add("you")
      .add("the")
      .add("best")
      .accept("!!!");
    Stream<String> stringStream = builder.build();

    stringStream
      .skip(2)  // Skips the first 2 elements
      .limit(3) // Then selecting only next 3 elements
      .forEach(System.out::println);
  }
}
