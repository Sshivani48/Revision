import java.util.Arrays;
import java.util.List;

public class arraysclass {
  public static void main(String[] args) {
    int[] arr = { 12, 34, 56, 78, 90 };
    System.out.println("Using for loop");
    for (int a : arr) {
      System.out.println(a);
    }
    System.out.println("Using toString: " + Arrays.toString(arr));
    System.out.println("Search for 56-index is: " + Arrays.binarySearch(arr, 56));
    Arrays.sort(arr);
    System.out.println("Using sort: " + Arrays.toString(arr));
    System.out.println("Search for 48-index is: " + Arrays.binarySearch(arr, 48));
    int[] arr1 = Arrays.copyOf(arr, 8);
    System.out.println("Using copyOf: " + Arrays.toString(arr1));
    int[] arr2 = Arrays.copyOfRange(arr, 1, 5);
    System.out.println("Using copyOfRange: " + Arrays.toString(arr2));
    Arrays.fill(arr1, 48);
    System.out.println("Using fill: " + Arrays.toString(arr1));
    System.out.println("Hashcode: " + Arrays.hashCode(arr));
    System.out.println("Using equals: " + Arrays.equals(arr, arr2));
    List<Integer> arrlist = Arrays.asList(06, 31, 38, 48, 49);
    System.out.println("Using asList: " + arrlist);
    
  }
}
