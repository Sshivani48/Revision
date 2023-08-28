import java.util.Scanner;
import java.util.Arrays;

public class gt4challenge6 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the array size: ");
    int sz = sc.nextInt();
    int[] arr = new int[sz];
    System.out.println("Enter array elements: ");
    for (int i = 0; i < arr.length; i++) {
      arr[i] = sc.nextInt();
    }
    Arrays.sort(arr);
    System.out.println("Enter target element: ");
    int a = sc.nextInt();
    int output = closestelemnt(arr, a);
    System.out.println("Closest element: " + output);

  }

  public static int closestelemnt(int[] Arr, int num) {
    int closest = -1;
    int n = Arrays.binarySearch(Arr, num);
    if (n<0) {
      if(Arrays.binarySearch(Arr, num-1)>0&& Arrays.binarySearch(Arr, num-1)<Arr.length) {
        closest = num-1;
      } else if(Arrays.binarySearch(Arr, num+1)>0&& Arrays.binarySearch(Arr, num+1)<Arr.length)
      closest = num+1;
    } else {
      if (Arr[n - 1] == num - 1) {
        closest = Arr[n - 1];
      } else if (Arr[n + 1] == num + 1) {
        closest = Arr[n + 1];
      }
    }
    return closest;
  }
}