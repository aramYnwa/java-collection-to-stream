import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;

public class Main {

  public static int reduce(
    List<Integer> values,
    int valueIfEmpty,
    BinaryOperator<Integer> reduction) {

    int result = valueIfEmpty;
    for (int value : values) {
      result = reduction.apply(result, value);
    }
    return result;
  }

  public static void main(String[] args) {

    List<Integer> ints = Arrays.asList(0, 1, 2, 3, 4, -1, -2, -3, -4);

    List<Integer> ints1 = Arrays.asList(0, 1, 2, 3, 4);
    List<Integer> ints2 = Arrays.asList(-1, -2, -3, -4);

    // Reduction operation should be associative!!!
    //BinaryOperator<Integer> op = (i1, i2) -> Integer.sum(i1, i2);
    //BinaryOperator<Integer> op = (i1, i2) -> Integer.max(i1, i2);

    //Examples of non associative reduction operations.
    //BinaryOperator<Integer> op = (i1, i2) -> i1*i1 + i2*i2;
    BinaryOperator<Integer> op = (i1, i2) -> (i1 + i2) / 2;

    int reduction1 = reduce(ints1, 0, op);
    int reduction2 = reduce(ints2, 0, op);
    int reduction_parallel = reduce(Arrays.asList(reduction1, reduction2), 0, op);
    int reduction = reduce(ints, 0, op);

    System.out.println("Reduction parallel : " + reduction_parallel);
    System.out.println("Reduction : " + reduction);
  }
}
