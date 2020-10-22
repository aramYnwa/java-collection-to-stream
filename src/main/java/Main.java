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

    // These all operators might not evaluate all elements of stream.
    // They terminate if the condition is not true
    boolean anyString = stringStream
      .anyMatch(p -> p.length() > 5);

    boolean allStrings = stringStream
      .allMatch(p -> p.length() > 5);

    boolean nonString = stringStream
      .noneMatch(p -> p.length() > 5);
  }
}
