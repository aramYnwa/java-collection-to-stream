import java.util.stream.Stream;

public class Main {

  public static void main(String[] args) {

    Stream.Builder<String> builder = Stream.builder();
    builder.add("Hello").add("World").accept("!!!");
    Stream<String> stringStream = builder.build();

    stringStream.forEach(System.out::println);

  }
}
