import java.util.*;

public class gt4challenge7 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the array size: ");
    int sz = sc.nextInt();
    int[] arr = new int[sz];
    System.out.println("Enter array elements: ");
    for (int i = 0; i < arr.length; i++) {
      arr[i] = sc.nextInt();
    }
    System.out.println("Enter target element: ");
    int a = sc.nextInt();
    int n = Arrays.binarySearch(arr, a);

    int count = 0;
    for (int i = 1; i <= a; i++) {
      if (a % i == 0) {
        count++;
      }
    }
    if (count == 2) {
      System.out.println(a + " is present in " + n + " index position and it is a prime number");
    } else {
      System.out.println(a + " is present in " + n + " index position and it is not a prime number");
    }
  }
}