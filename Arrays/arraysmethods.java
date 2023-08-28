import java.util.*;
public class arraysmethods {

public static void main(String args[]) {
  int[] array = { 6,1, 2, 3 };
  System.out.println("Stream: "+Arrays.stream(array));
  Arrays.parallelSort(array);
  System.out.println("Parallelsort: "+Arrays.toString(array));
  int[] arr1 = {1, 2, 3, 4, 5};
  int[] arr2 = {1, 2, 3, 9, 5};
  int mismatchIndex = Arrays.mismatch(arr1, arr2);
  if (mismatchIndex == -1) {
    System.out.println("Arrays are identical.");
  } else {
    System.out.println("Arrays differ at index " + mismatchIndex);
  }
  List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
  Spliterator<Integer> numberSpliterator = numbers.spliterator();

numberSpliterator.forEachRemaining(System.out::println);


}
}