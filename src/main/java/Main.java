import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;

public class Main {

  public static void main(String[] args) {

    List<Integer> ints = Arrays.asList(0, 1, 2, 3, 4, -1, -2, -3, -4);

    List<Integer> ints1 = Arrays.asList(0, 1, 2, 3, 4);
    List<Integer> ints2 = Arrays.asList(-1, -2, -3, -4);

    BinaryOperator<Integer> op = (i1, i2) -> Integer.max(i1, i2);

  }
}
