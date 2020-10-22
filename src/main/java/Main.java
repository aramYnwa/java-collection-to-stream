import java.util.Optional;
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

//    Optional<String> firstOptional =
//      stringStream
//        .filter(p -> p.length() > 5)
//        .findFirst();
//
//    firstOptional.ifPresent(System.out::println);

    Optional<String> anyOptional =
      stringStream
        .filter(p -> p.length() > 3)
        .findAny();

    anyOptional.ifPresent(System.out::println);

  }
}
